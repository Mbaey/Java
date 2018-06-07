/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : cart

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2018-04-29 15:51:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `price` float default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '龙虾', '879.541');
INSERT INTO `product` VALUES ('2', '大螯虾', '95.198');
INSERT INTO `product` VALUES ('3', '小虾', '462.868');
INSERT INTO `product` VALUES ('4', '虾仁', '547.247');
INSERT INTO `product` VALUES ('5', '长额虾', '60.4858');
INSERT INTO `product` VALUES ('6', '宝石', '174.232');
INSERT INTO `product` VALUES ('7', '玻璃饰品', '229.025');
INSERT INTO `product` VALUES ('8', '铂', '774.104');
INSERT INTO `product` VALUES ('9', '刺绣品', '418.326');
INSERT INTO `product` VALUES ('10', '雕版画、印制画', '341.426');
INSERT INTO `product` VALUES ('11', '雕塑品', '839.909');
INSERT INTO `product` VALUES ('12', '仿宝石', '315.018');
INSERT INTO `product` VALUES ('13', '仿首饰', '931.355');
INSERT INTO `product` VALUES ('14', '古物', '708.349');
INSERT INTO `product` VALUES ('15', '画布', '967.038');
INSERT INTO `product` VALUES ('16', '金', '606.028');
INSERT INTO `product` VALUES ('17', '金首饰', '808.411');
INSERT INTO `product` VALUES ('18', '景泰兰', '21.5606');
INSERT INTO `product` VALUES ('19', '木刻', '174.742');
INSERT INTO `product` VALUES ('20', '木制雕像', '465.969');
INSERT INTO `product` VALUES ('21', '人体模型', '69.4764');
INSERT INTO `product` VALUES ('22', '人造花', '48.4667');
INSERT INTO `product` VALUES ('23', '收藏品', '233.039');
INSERT INTO `product` VALUES ('24', '塑像', '851.302');
INSERT INTO `product` VALUES ('25', '相框、画框', '814.962');
INSERT INTO `product` VALUES ('26', '银器', '657.861');
INSERT INTO `product` VALUES ('27', '银首饰', '822.477');
INSERT INTO `product` VALUES ('28', '油画、粉画', '151.931');
INSERT INTO `product` VALUES ('29', '珍珠', '172.59');
INSERT INTO `product` VALUES ('30', '植物枝、叶', '954.222');
INSERT INTO `product` VALUES ('31', '对虾', '315.151');
INSERT INTO `product` VALUES ('32', '蟹', '97.5232');
INSERT INTO `product` VALUES ('33', '小龙虾', '414.635');
INSERT INTO `product` VALUES ('34', '扇贝', '24.4862');
INSERT INTO `product` VALUES ('35', '墨鱼及鱿鱼', '553.135');
INSERT INTO `product` VALUES ('36', '章鱼', '20.5389');
INSERT INTO `product` VALUES ('37', '蜗牛及螺', '642.33');
INSERT INTO `product` VALUES ('38', '鲍鱼', '59.109');
INSERT INTO `product` VALUES ('39', '海参', '525.129');
INSERT INTO `product` VALUES ('40', '干、盐渍的软件动物', '126.726');
INSERT INTO `product` VALUES ('41', '贻贝', '52.5621');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'tom', '123');
INSERT INTO `user` VALUES ('2', 'Mister.李', '1234');
INSERT INTO `user` VALUES ('3', '李同学', '1234');
