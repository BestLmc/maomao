
# 订单库
create database seata_order;

# 订单表
CREATE TABLE t_order(
`id` bigint(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
`user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
`product_id` bigint(11) DEFAULT NULL COMMENT '产品id',
`count` int(11) DEFAULT NULL COMMENT '数量',
`money` decimal(11,0) DEFAULT NULL COMMENT '金额',
`status` int(1) DEFAULT NULL COMMENT '订单状态：0：创建中1：已完结'
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARACTER SET=utf8;


#库存库
create database seata_storage;

CREATE TABLE t_storage(
`id` bigint(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
`product_id` bigint(11) DEFAULT NULL COMMENT '产品id',
`total` int(11) DEFAULT NULL COMMENT '总库存',
`used` int(11) DEFAULT NULL COMMENT '已用库存',
`residue` int(11) DEFAULT NULL COMMENT '剩余库存'
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARACTER SET=utf8;

insert into seata_storage.t_storage(`id`,`product_id`,`total`,`used`,`residue`)
values('1','1','100','0','100');


#账户库
create database seata_account;

CREATE TABLE t_account(
`id` bigint(11) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT 'id',
`user_id` bigint(11) DEFAULT NULL COMMENT '用户id',
`total` DECIMAL(10,0) DEFAULT NULL COMMENT '总额度',
`used` DECIMAL(10,0) DEFAULT NULL COMMENT '已用余额',
`residue` DECIMAL(10,0) DEFAULT NULL COMMENT '剩余可用额度'
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARACTER SET=utf8;

insert into seata_account.t_account(`id`,`user_id`,`total`,`used`,`residue`)
values('1','1','1000','0','1000');


