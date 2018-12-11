/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : db_test

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-07-31 12:50:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_addr
-- ----------------------------
DROP TABLE IF EXISTS `tb_addr`;
CREATE TABLE `tb_addr` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `town_id` int(11) DEFAULT NULL,
  `area` varchar(68) DEFAULT NULL,
  `name` varchar(14) DEFAULT NULL,
  `phone` varchar(14) DEFAULT NULL,
  `def` tinyint(5) DEFAULT NULL,
  `comment` varchar(125) DEFAULT NULL,
  `customer_id` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `town_id` (`town_id`) USING BTREE,
  KEY `user_id` (`customer_id`) USING BTREE,
  CONSTRAINT `tb_addr_ibfk_1` FOREIGN KEY (`town_id`) REFERENCES `tb_town` (`id`),
  CONSTRAINT `tb_addr_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_after_sales
-- ----------------------------
DROP TABLE IF EXISTS `tb_after_sales`;
CREATE TABLE `tb_after_sales` (
  `orderItem_Id` bigint(11) NOT NULL COMMENT ' 购买后的售后表',
  `sendDate` datetime DEFAULT NULL COMMENT '发货日期',
  `send_number` varchar(50) DEFAULT NULL COMMENT '快递单号',
  `confirmDate` datetime DEFAULT NULL COMMENT '确认收货日期',
  `return_reason` varchar(255) DEFAULT NULL COMMENT '退货理由',
  `retrunDate` datetime DEFAULT NULL,
  `agree` tinyint(255) DEFAULT NULL COMMENT '卖家是否同意',
  PRIMARY KEY (`orderItem_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_category
-- ----------------------------
DROP TABLE IF EXISTS `tb_category`;
CREATE TABLE `tb_category` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(14) DEFAULT NULL COMMENT '类别名称',
  `status` tinyint(1) DEFAULT NULL COMMENT '是否显示 1显示 0不显示',
  `level` tinyint(4) DEFAULT NULL COMMENT '同级类目的展现次序，如果数值相等则按名称次序排列',
  `parent_id` bigint(11) DEFAULT NULL COMMENT '父类别的id',
  `isParent` tinyint(1) DEFAULT NULL COMMENT '是否为父类目 1是 0不是',
  `href` varchar(250) DEFAULT NULL,
  `desc` varchar(125) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `parent_id` (`parent_id`) USING BTREE,
  CONSTRAINT `tb_category_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `tb_category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_city
-- ----------------------------
DROP TABLE IF EXISTS `tb_city`;
CREATE TABLE `tb_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `province_id` (`province_id`) USING BTREE,
  CONSTRAINT `tb_city_ibfk_1` FOREIGN KEY (`province_id`) REFERENCES `tb_province` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=392 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_comment
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment` (
  `orderItem_Id` bigint(255) NOT NULL COMMENT 'tb_comment',
  `commentText` varchar(255) DEFAULT NULL,
  `commentDate` datetime DEFAULT NULL,
  `score` tinyint(255) DEFAULT NULL,
  `imgs` text,
  `isappend` tinyint(255) DEFAULT NULL,
  `append_comment` varchar(255) DEFAULT NULL,
  `appendDate` datetime DEFAULT NULL,
  `append_imgs` text,
  PRIMARY KEY (`orderItem_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(14) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `nickname` varchar(32) DEFAULT NULL,
  `img` varchar(90) DEFAULT NULL,
  `phone` varchar(13) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `actived` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_favorite
-- ----------------------------
DROP TABLE IF EXISTS `tb_favorite`;
CREATE TABLE `tb_favorite` (
  `id` bigint(11) NOT NULL DEFAULT '0',
  `customer_id` bigint(11) DEFAULT NULL,
  `tag` tinyint(1) DEFAULT NULL COMMENT 'bit为0表示该收藏为店铺，1表示为商品',
  `goods_id` bigint(11) DEFAULT NULL,
  `store_id` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `goods_id` (`goods_id`) USING BTREE,
  KEY `store_id` (`store_id`) USING BTREE,
  KEY `tb_favorite_ibfk_1` (`customer_id`) USING BTREE,
  CONSTRAINT `tb_favorite_ibfk_1` FOREIGN KEY (`store_id`) REFERENCES `tb_seller` (`id`),
  CONSTRAINT `tb_favorite_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`),
  CONSTRAINT `tb_favorite_ibfk_3` FOREIGN KEY (`goods_id`) REFERENCES `tb_goods_item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_goods_item
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods_item`;
CREATE TABLE `tb_goods_item` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `enable` tinyint(3) DEFAULT NULL COMMENT '是否上架？',
  `shopId` bigint(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `subtitle` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL COMMENT '价格，用于排序',
  `images` text COMMENT 'json',
  `vedios` varchar(255) DEFAULT NULL,
  `categoryId` bigint(11) DEFAULT NULL,
  `rootCategoryId` bigint(11) DEFAULT NULL,
  `skuText` varchar(255) DEFAULT NULL COMMENT '对不同property的描述！',
  `favcount` bigint(11) DEFAULT NULL COMMENT '收藏数量',
  `tmallDescUrl` varchar(255) DEFAULT NULL COMMENT '商品下方详情的图片集合',
  `extData` varchar(255) DEFAULT NULL COMMENT '表示property有几个 json  {\r\n            "addressLevel":3\r\n        }',
  `props` text COMMENT 'json "groupProps":[\r\n            {\r\n                "基本信息":[\r\n                    {\r\n                        "廓形":"A型 "\r\n                    },\r\n                    {\r\n                        "材质成分":"棉96.7% 聚氨酯弹性纤维(氨纶)3.3% "\r\n                    },\r\n                    {\r\n                        "销售渠道类型":"商场同款(线上线下都销售) "\r\n                    },\r\n                    {\r\n                        "货号":"8500025-1 "\r\n                    },\r\n                    {\r\n                        "风格":"通勤 "\r\n                    },\r\n                    {\r\n                        "组合形式":"单件 "\r\n                    },\r\n                    {\r\n                        "裙长":"中裙 "\r\n                    },\r\n                    {\r\n                        "款式":"其他/other "\r\n                    },\r\n                    {\r\n                        "袖长":"短袖 "\r\n                    },\r\n                    {\r\n                        "领型":"圆领 "\r\n                    },\r\n                    {\r\n                        "袖型":"常规 "\r\n                    }',
  `totalCommentCount` bigint(11) DEFAULT NULL COMMENT 'rate->totalCount',
  `monthSellCount` bigint(11) DEFAULT NULL COMMENT '不知道哪里来',
  `froms` varchar(10) DEFAULT NULL COMMENT '产地 突然想起来还有一个API, 但是Tmall做了身份验证了？？  https://mdskip.taobao.com/core/initItemDetail.htm?isUseInventoryCenter=false&cartEnable=true&service3C=false&isApparel=true&isSecKill=false&tmallBuySupport=true&isAreaSell=false&tryBeforeBuy=false&offlineShop=false&itemId=573554318210&showShopProm=false&cachedTimestamp=1532656866724&isPurchaseMallPage=false&isRegionLevel=false&household=false&sellerPreview=false&queryMemberRight=true&addressLevel=2&isForbidBuyItem=false&callback=setMdskip&timestamp=1532663763915&isg=null&isg2=BPb2HagNsRspKEXzQuiyU2gORyxUBX4DUmKEkmDf4ll0o5Y9yKeKYVxRvz9qEDJp',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `store_id` (`shopId`) USING BTREE,
  KEY `categoryId` (`categoryId`) USING BTREE,
  CONSTRAINT `tb_goods_item_ibfk_2` FOREIGN KEY (`shopId`) REFERENCES `tb_seller` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=527262613136 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态： 1完成 2已下单 3 已支付 4已评论 5结束',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `paymethod_id` tinyint(4) DEFAULT NULL COMMENT '付款方式编号',
  `addr_id` int(4) DEFAULT NULL COMMENT '收获地址编号',
  `customer_id` bigint(11) DEFAULT NULL COMMENT '顾客编号',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `addr_id` (`addr_id`) USING BTREE,
  KEY `user_id` (`customer_id`) USING BTREE,
  KEY `paymethod_id` (`paymethod_id`) USING BTREE,
  CONSTRAINT `tb_order_ibfk_1` FOREIGN KEY (`paymethod_id`) REFERENCES `tb_paymethod` (`id`),
  CONSTRAINT `tb_order_ibfk_2` FOREIGN KEY (`addr_id`) REFERENCES `tb_addr` (`id`),
  CONSTRAINT `tb_order_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_orderitem
-- ----------------------------
DROP TABLE IF EXISTS `tb_orderitem`;
CREATE TABLE `tb_orderitem` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `goods_id` bigint(11) DEFAULT NULL,
  `amount` tinyint(4) DEFAULT NULL,
  `price` int(10) DEFAULT NULL COMMENT '总价',
  `order_id` bigint(11) DEFAULT NULL,
  `customer_id` bigint(11) DEFAULT NULL COMMENT '冗余，便于开发',
  `status` tinyint(255) DEFAULT NULL COMMENT '0：正常订单生成， createDate\r\n1: 订单付款 payDate\r\n2：发货	deliveryDate   deliveryNumber\r\n3：确认收货 confirmDate\r\n4: 用户评价，评分  commentDate  comment，score\r\n5: 追加评价  appendDate appendComment\r\n6~8: 保留，以后继续设计。\r\n9: 用户申请退款， \r\n10：店家同意退款 \r\n-1:店家不同意退款\r\n\r\n	 \r\n',
  `createDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `goods_id` (`goods_id`) USING BTREE,
  KEY `order_id` (`order_id`) USING BTREE,
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `tb_orderitem_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `tb_order` (`id`),
  CONSTRAINT `tb_orderitem_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `tb_sku` (`id`),
  CONSTRAINT `tb_orderitem_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_paymethod
-- ----------------------------
DROP TABLE IF EXISTS `tb_paymethod`;
CREATE TABLE `tb_paymethod` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_props
-- ----------------------------
DROP TABLE IF EXISTS `tb_props`;
CREATE TABLE `tb_props` (
  `id` bigint(11) NOT NULL COMMENT ' ',
  `name` varchar(255) DEFAULT NULL COMMENT '不同型号商品名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_prop_value
-- ----------------------------
DROP TABLE IF EXISTS `tb_prop_value`;
CREATE TABLE `tb_prop_value` (
  `id` bigint(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '每个属性不同的值',
  `image` varchar(255) DEFAULT NULL COMMENT '是否有图片',
  `pId` bigint(11) DEFAULT NULL,
  `goodsId` bigint(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`,`goodsId`),
  KEY `pid` (`pId`) USING BTREE,
  KEY `tb_prop_value_ibfk_2` (`goodsId`),
  CONSTRAINT `tb_prop_value_ibfk_1` FOREIGN KEY (`pId`) REFERENCES `tb_props` (`id`),
  CONSTRAINT `tb_prop_value_ibfk_2` FOREIGN KEY (`goodsId`) REFERENCES `tb_goods_item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_province
-- ----------------------------
DROP TABLE IF EXISTS `tb_province`;
CREATE TABLE `tb_province` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `area` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_sales_statistic
-- ----------------------------
DROP TABLE IF EXISTS `tb_sales_statistic`;
CREATE TABLE `tb_sales_statistic` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `amount` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_seller
-- ----------------------------
DROP TABLE IF EXISTS `tb_seller`;
CREATE TABLE `tb_seller` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `userId` bigint(11) DEFAULT NULL COMMENT '店主id',
  `shopName` varchar(25) DEFAULT NULL,
  `shopUrl` varchar(255) DEFAULT NULL,
  `shopIcon` varchar(255) DEFAULT NULL,
  `rateSum` bigint(11) DEFAULT NULL,
  `shopType` varchar(10) DEFAULT NULL COMMENT 'A,B,C',
  `creditLevel` varchar(10) DEFAULT NULL COMMENT '16,15,...',
  `starts` timestamp NULL DEFAULT NULL,
  `encryptSellerId` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `tb_seller_ibfk_1` (`userId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=148538348 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_sku
-- ----------------------------
DROP TABLE IF EXISTS `tb_sku`;
CREATE TABLE `tb_sku` (
  `id` bigint(11) NOT NULL,
  `propPath` varchar(255) DEFAULT NULL COMMENT 'prop:value;   eg :"20509:28314;1627207:80819"',
  `images` varchar(255) DEFAULT NULL COMMENT '不同型号可能有不同图片',
  `priceMoney` bigint(10) DEFAULT NULL COMMENT '价格×100',
  `priceText` varchar(255) DEFAULT NULL COMMENT '唉，暂时不知道tmall是怎么打折的。这里是原价',
  `goodsItemId` bigint(11) DEFAULT NULL,
  `propValuesJson` text,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `goodsItemId` (`goodsItemId`) USING BTREE,
  CONSTRAINT `tb_sku_ibfk_1` FOREIGN KEY (`goodsItemId`) REFERENCES `tb_goods_item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for tb_town
-- ----------------------------
DROP TABLE IF EXISTS `tb_town`;
CREATE TABLE `tb_town` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `city_id` (`city_id`) USING BTREE,
  CONSTRAINT `tb_town_ibfk_1` FOREIGN KEY (`city_id`) REFERENCES `tb_city` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2956 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
