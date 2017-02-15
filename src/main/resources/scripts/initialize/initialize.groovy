//股票
database.createOrAlter("t_stock")
 .addColumn().name("u_id").alias("id").comment("ID").jdbcType(java.sql.JDBCType.VARCHAR).length(32).primaryKey().commit()
.addColumn().name("code").alias("code").comment("系统内部码").jdbcType(java.sql.JDBCType.VARCHAR).length(20).commit()
.addColumn().name("sec_name").alias("secName").comment("股票代码").jdbcType(java.sql.JDBCType.VARCHAR).length(255).commit()
.addColumn().name("ipo_date").alias("ipoDate").comment("发行日期").jdbcType(java.sql.JDBCType.TIMESTAMP).commit()
.addColumn().name("exch_city").alias("exchCity").comment("交易城市").jdbcType(java.sql.JDBCType.VARCHAR).length(255).commit()
.addColumn().name("sec_status").alias("secStatus").comment("股票状态").jdbcType(java.sql.JDBCType.VARCHAR).length(10).commit()
.addColumn().name("updata_date").alias("updataDate").comment("更新日期").jdbcType(java.sql.JDBCType.TIMESTAMP).commit()
.addColumn().name("ma_date").alias("maDate").comment("MA日期").jdbcType(java.sql.JDBCType.TIMESTAMP).commit()
 .comment("股票").commit();

def stock_module= [u_id: 'stock', name: '股票', uri: 'admin/stock/list.html', icon: '', parent_id: '-1', remark: '', status: 1, optional: '[{"id":"M","text":"菜单可见","checked":true},{"id":"import","text":"导入excel","checked":true},{"id":"export","text":"导出excel","checked":true},{"id":"R","text":"查询","checked":true},{"id":"C","text":"新增","checked":true},{"id":"U","text":"修改","checked":true},{"id":"D","text":"删除","checked":false}]', sort_index: 1];
database.getTable("s_modules").createInsert().value(stock_module).exec();
