import time
import random
import pymysql
import re
import json
from multiprocessing.dummy import Pool

config = {
    'host': 'localhost',
    'port': 3306,
    'user': 'root',
    'password': 'root',
    'db': 'db_emall',
    'charset': 'utf8',
    'cursorclass': pymysql.cursors.DictCursor,
}
connection = pymysql.connect(**config)
connection.autocommit(True)
cursor = connection.cursor()
for i in range(0, 61964, 5):
    cursor.execute('select * from tb_goods_json limit %s,%s', [i, i+5])
    jsonIds = cursor.fetchall()
    print(i)
    print('****************************************************************************************************************')
    for jsonId in jsonIds:
        allJs = json.loads(jsonId['id'])
        #props and value
        try:

            for propItem in allJs['skuBase']['props']:
                try:
                    cursor.execute('insert into tb_props values (%s, %s)',[propItem['pid'], propItem['name']])
                except Exception as e:
                    print('prop 重复啦')
                pass
                for value in propItem['values']:
                    #data=[value['vid'], value['name'],value['image'] ,propItem['pid']]
                    #print(data)
                    try:
                        cursor.execute('insert into tb_prop_value values (%s, %s, %s, %s, %s)',[value['vid'], value['name'],value['image'] ,propItem['pid'], allJs['item']['itemId']])
                    except Exception as e:
                        #print('prop_value 重复啦')
                        pass
                    pass
            #seller
            seller = allJs['seller']
            try:
                cursor.execute('insert into tb_seller values (%s, %s, %s, %s,%s, %s, %s,%s, %s, %s)',[seller['shopId'], seller['userId'],seller['shopName'] ,seller['shopUrl'], seller['shopIcon'],seller['rateSum'], seller['shopType'],seller['creditLevel'] ,seller['starts'], seller['encryptSellerId']])
            except Exception as e:
                print('shop 重复啦')

            #shop_item and category
            shopItem = allJs['item']
            itemId=shopItem['itemId']
            #shopItem['categoryId'], shopItem['rootCategoryId']
            #cursor.execute('insert into tb_seller values (%s, %s, %s,  找不到caegoryName
            cursor.execute('insert into tb_goods_item values (%s, %s, %s, %s,%s, %s, %s,%s, %s, %s,%s, %s, %s, %s,%s, null,null,null)',
                           [itemId, shopItem['enable'],seller['shopId'], shopItem['title'],shopItem['subtitle'], allJs['mock']['skuCore']['sku2info']['0']['price']['priceMoney'],
                           json.dumps({'images': shopItem['images']}), shopItem['videos'], shopItem['categoryId'], shopItem['rootCategoryId'],
                           shopItem['skuText'],shopItem['favcount'],  shopItem['tmallDescUrl'],shopItem['extData']['addressLevel'],
                           json.dumps({'groupProps':allJs['props']['groupProps']})])

            #sku
            sku2info=allJs['mock']['skuCore']['sku2info']
            skuBaseList=allJs['skuBase']['skus']
            for skuBase in skuBaseList:
                skuId = skuBase['skuId']
                skuPrice =sku2info[str(skuId)]['price']
                cursor.execute('insert into tb_sku values (%s,%s,%s,%s,%s,%s)',
                               [skuId,skuBase['propPath'],skuBase['images'],
                                skuPrice['priceMoney'],skuPrice['priceText'],itemId ])
        except Exception as e:
            print(e)

        
        #break
    #break
cursor.close()
connection.close()
