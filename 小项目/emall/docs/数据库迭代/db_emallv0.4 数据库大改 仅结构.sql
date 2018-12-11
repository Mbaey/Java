/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50613
 Source Host           : localhost:3306
 Source Schema         : db_emall

 Target Server Type    : MySQL
 Target Server Version : 50613
 File Encoding         : 65001

 Date: 31/07/2018 09:49:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_addr
-- ----------------------------
DROP TABLE IF EXISTS `tb_addr`;
CREATE TABLE `tb_addr`  (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `town_id` int(11) NULL DEFAULT NULL,
  `area` varchar(68) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `def` tinyint(5) NULL DEFAULT NULL,
  `comment` varchar(125) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customer_id` bigint(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `town_id`(`town_id`) USING BTREE,
  INDEX `user_id`(`customer_id`) USING BTREE,
  CONSTRAINT `tb_addr_ibfk_1` FOREIGN KEY (`town_id`) REFERENCES `tb_town` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_addr_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_buy_record
-- ----------------------------
DROP TABLE IF EXISTS `tb_buy_record`;
CREATE TABLE `tb_buy_record`  (
  `id` bigint(11) NOT NULL DEFAULT 0,
  `customer_id` bigint(11) NULL DEFAULT NULL,
  `store_id` bigint(11) NULL DEFAULT NULL,
  `goods_id` bigint(11) NULL DEFAULT NULL,
  `amount` bigint(11) NULL DEFAULT NULL,
  `kuai_di_dan_hao` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递单号',
  `tui_kuai_yuan_yin` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '退款原因',
  `is_tui_kuai` tinyint(4) NULL DEFAULT NULL COMMENT '0：正常订单，1:用户申请退款， 2：店家同意退款 3:店家不同意退款',
  `comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `score` decimal(2, 1) NULL DEFAULT 0.0,
  `is_append` tinyint(4) NULL DEFAULT NULL,
  `comment_append` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `customer_id`(`customer_id`) USING BTREE,
  INDEX `goods_id`(`goods_id`) USING BTREE,
  INDEX `store_id`(`store_id`) USING BTREE,
  CONSTRAINT `tb_buy_record_ibfk_1` FOREIGN KEY (`goods_id`) REFERENCES `tb_sku` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_buy_record_ibfk_2` FOREIGN KEY (`store_id`) REFERENCES `tb_seller` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_buy_record_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_category
-- ----------------------------
DROP TABLE IF EXISTS `tb_category`;
CREATE TABLE `tb_category`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别名称',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '是否显示 1显示 0不显示',
  `level` tinyint(4) NULL DEFAULT NULL COMMENT '同级类目的展现次序，如果数值相等则按名称次序排列',
  `parent_id` bigint(11) NULL DEFAULT NULL COMMENT '父类别的id',
  `isParent` tinyint(1) NULL DEFAULT NULL COMMENT '是否为父类目 1是 0不是',
  `href` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `desc` varchar(125) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createTime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updateTime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `parent_id`(`parent_id`) USING BTREE,
  CONSTRAINT `tb_category_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `tb_category` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_city
-- ----------------------------
DROP TABLE IF EXISTS `tb_city`;
CREATE TABLE `tb_city`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `province_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `province_id`(`province_id`) USING BTREE,
  CONSTRAINT `tb_city_ibfk_1` FOREIGN KEY (`province_id`) REFERENCES `tb_province` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 392 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nickname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img` varchar(90) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `actived` tinyint(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_favorite
-- ----------------------------
DROP TABLE IF EXISTS `tb_favorite`;
CREATE TABLE `tb_favorite`  (
  `id` bigint(11) NOT NULL DEFAULT 0,
  `customer_id` bigint(11) NULL DEFAULT NULL,
  `tag` tinyint(1) NULL DEFAULT NULL COMMENT 'bit为0表示该收藏为店铺，1表示为商品',
  `goods_id` bigint(11) NULL DEFAULT NULL,
  `store_id` bigint(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `goods_id`(`goods_id`) USING BTREE,
  INDEX `store_id`(`store_id`) USING BTREE,
  INDEX `tb_favorite_ibfk_1`(`customer_id`) USING BTREE,
  CONSTRAINT `tb_favorite_ibfk_1` FOREIGN KEY (`store_id`) REFERENCES `tb_seller` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_favorite_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_favorite_ibfk_3` FOREIGN KEY (`goods_id`) REFERENCES `tb_goods_item` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_goods_item
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods_item`;
CREATE TABLE `tb_goods_item`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `enable` tinyint(3) NULL DEFAULT NULL COMMENT '是否上架？',
  `shopId` bigint(11) NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `subtitle` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` int(11) NULL DEFAULT NULL COMMENT '价格，用于排序',
  `images` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'json',
  `vedios` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `categoryId` bigint(11) NULL DEFAULT NULL,
  `rootCategoryId` bigint(11) NULL DEFAULT NULL,
  `skuText` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对不同property的描述！',
  `favcount` bigint(11) NULL DEFAULT NULL COMMENT '收藏数量',
  `tmallDescUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品下方详情的图片集合',
  `extData` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表示property有几个 json  {\r\n            \"addressLevel\":3\r\n        }',
  `props` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'json \"groupProps\":[\r\n            {\r\n                \"基本信息\":[\r\n                    {\r\n                        \"廓形\":\"A型 \"\r\n                    },\r\n                    {\r\n                        \"材质成分\":\"棉96.7% 聚氨酯弹性纤维(氨纶)3.3% \"\r\n                    },\r\n                    {\r\n                        \"销售渠道类型\":\"商场同款(线上线下都销售) \"\r\n                    },\r\n                    {\r\n                        \"货号\":\"8500025-1 \"\r\n                    },\r\n                    {\r\n                        \"风格\":\"通勤 \"\r\n                    },\r\n                    {\r\n                        \"组合形式\":\"单件 \"\r\n                    },\r\n                    {\r\n                        \"裙长\":\"中裙 \"\r\n                    },\r\n                    {\r\n                        \"款式\":\"其他/other \"\r\n                    },\r\n                    {\r\n                        \"袖长\":\"短袖 \"\r\n                    },\r\n                    {\r\n                        \"领型\":\"圆领 \"\r\n                    },\r\n                    {\r\n                        \"袖型\":\"常规 \"\r\n                    }',
  `totalCommentCount` bigint(11) NULL DEFAULT NULL COMMENT 'rate->totalCount',
  `monthSellCount` bigint(11) NULL DEFAULT NULL COMMENT '不知道哪里来',
  `froms` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '产地 突然想起来还有一个API, 但是Tmall做了身份验证了？？  https://mdskip.taobao.com/core/initItemDetail.htm?isUseInventoryCenter=false&cartEnable=true&service3C=false&isApparel=true&isSecKill=false&tmallBuySupport=true&isAreaSell=false&tryBeforeBuy=false&offlineShop=false&itemId=573554318210&showShopProm=false&cachedTimestamp=1532656866724&isPurchaseMallPage=false&isRegionLevel=false&household=false&sellerPreview=false&queryMemberRight=true&addressLevel=2&isForbidBuyItem=false&callback=setMdskip&timestamp=1532663763915&isg=null&isg2=BPb2HagNsRspKEXzQuiyU2gORyxUBX4DUmKEkmDf4ll0o5Y9yKeKYVxRvz9qEDJp',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `store_id`(`shopId`) USING BTREE,
  INDEX `categoryId`(`categoryId`) USING BTREE,
  CONSTRAINT `tb_goods_item_ibfk_2` FOREIGN KEY (`shopId`) REFERENCES `tb_seller` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 527262613136 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `status` tinyint(4) NULL DEFAULT NULL COMMENT '状态： 1完成 2已下单 3 已支付 4已评论 5结束',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '价格',
  `paymethod_id` tinyint(4) NULL DEFAULT NULL COMMENT '付款方式编号',
  `addr_id` int(4) NULL DEFAULT NULL COMMENT '收获地址编号',
  `customer_id` bigint(11) NULL DEFAULT NULL COMMENT '顾客编号',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `addr_id`(`addr_id`) USING BTREE,
  INDEX `user_id`(`customer_id`) USING BTREE,
  INDEX `paymethod_id`(`paymethod_id`) USING BTREE,
  CONSTRAINT `tb_order_ibfk_1` FOREIGN KEY (`paymethod_id`) REFERENCES `tb_paymethod` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_order_ibfk_2` FOREIGN KEY (`addr_id`) REFERENCES `tb_addr` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_order_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_orderitem
-- ----------------------------
DROP TABLE IF EXISTS `tb_orderitem`;
CREATE TABLE `tb_orderitem`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `goods_id` bigint(11) NULL DEFAULT NULL,
  `amount` tinyint(4) NOT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `order_id` bigint(11) NULL DEFAULT NULL,
  `customer_id` bigint(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `goods_id`(`goods_id`) USING BTREE,
  INDEX `order_id`(`order_id`) USING BTREE,
  INDEX `customer_id`(`customer_id`) USING BTREE,
  CONSTRAINT `tb_orderitem_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `tb_order` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_orderitem_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `tb_sku` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_orderitem_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_paymethod
-- ----------------------------
DROP TABLE IF EXISTS `tb_paymethod`;
CREATE TABLE `tb_paymethod`  (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_prop_value
-- ----------------------------
DROP TABLE IF EXISTS `tb_prop_value`;
CREATE TABLE `tb_prop_value`  (
  `id` bigint(11) NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '每个属性不同的值',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否有图片',
  `pId` bigint(11) NULL DEFAULT NULL,
  `goodsId` bigint(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`, `goodsId`) USING BTREE,
  INDEX `pid`(`pId`) USING BTREE,
  INDEX `tb_prop_value_ibfk_2`(`goodsId`) USING BTREE,
  CONSTRAINT `tb_prop_value_ibfk_1` FOREIGN KEY (`pId`) REFERENCES `tb_props` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_prop_value_ibfk_2` FOREIGN KEY (`goodsId`) REFERENCES `tb_goods_item` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_props
-- ----------------------------
DROP TABLE IF EXISTS `tb_props`;
CREATE TABLE `tb_props`  (
  `id` bigint(11) NOT NULL COMMENT ' ',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '不同型号商品名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_province
-- ----------------------------
DROP TABLE IF EXISTS `tb_province`;
CREATE TABLE `tb_province`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `area` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_sales
-- ----------------------------
DROP TABLE IF EXISTS `tb_sales`;
CREATE TABLE `tb_sales`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `date` date NULL DEFAULT NULL,
  `amount` bigint(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_sku
-- ----------------------------
DROP TABLE IF EXISTS `tb_sku`;
CREATE TABLE `tb_sku`  (
  `id` bigint(11) NOT NULL,
  `propPath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'prop:value;   eg :\"20509:28314;1627207:80819\"',
  `images` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '不同型号可能有不同图片',
  `priceMoney` bigint(10) NULL DEFAULT NULL COMMENT '价格×100',
  `priceText` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '唉，暂时不知道tmall是怎么打折的。这里是原价',
  `goodsItemId` bigint(11) NULL DEFAULT NULL,
  `propValuesJson` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `goodsItemId`(`goodsItemId`) USING BTREE,
  CONSTRAINT `tb_sku_ibfk_1` FOREIGN KEY (`goodsItemId`) REFERENCES `tb_goods_item` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_town
-- ----------------------------
DROP TABLE IF EXISTS `tb_town`;
CREATE TABLE `tb_town`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `city_id`(`city_id`) USING BTREE,
  CONSTRAINT `tb_town_ibfk_1` FOREIGN KEY (`city_id`) REFERENCES `tb_city` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2956 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
