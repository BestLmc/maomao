#支付实体表
CREATE TABLE `payment`(
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `serial` varchar (200) DEFAULT '' COMMENT '序列号',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

ALTER TABLE maomao.payment COMMENT=`支付实体表`;









#测试使用
CREATE TABLE `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `description` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE student(
  id INT PRIMARY KEY AUTO_INCREMENT COMMENT '学号',
  name VARCHAR(200) COMMENT '姓名',
  age    int COMMENT '年龄'
) COMMENT='学生信息';