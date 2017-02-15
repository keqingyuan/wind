<#import "../../global.ftl" as global />
<#import "../../authorize.ftl" as authorize/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
<@global.importMiniui/>
    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            border: 0;
            width: 100%;
            height: 100%;
            overflow: hidden;
        }
    </style>
</head>
<body>
<div class="mini-toolbar" style="width: 100%;padding:2px;border-bottom:0;">
    <table id="searchForm" style="width:100%;border: 0px">
        <tr>
            <td style="width:100%;">
            <#if authorize.module('user','C')>
                <a class="mini-button" iconCls="icon-add" plain="true" onclick="create()">新建股票</a>
                <span class="separator"></span>
            </#if>
                <a class="mini-button" iconCls="icon-reload" plain="true" onclick="grid.reload()">刷新</a>
            </td>
            <td style="white-space:nowrap;">
                <label>股票代码: </label>
                <input name="code$LIKE" style="width: 100px" onenter="search()" class="mini-textbox"/>
                <a class="mini-button" iconCls="icon-search" plain="true" onclick="search()">查询</a>
            </td>
        </tr>
    </table>
</div>
<div class="mini-fit">
    <div id="datagrid" class="mini-datagrid" style="width:100%;height:100%;"
         url="<@global.api 'stock'/>" ajaxOptions="{type:'GET',dataType:'json'}" idField="id"
         sizeList="[10,20,50,200]" pageSize="200">
        <div property="columns">
            <div type="indexcolumn"></div>
                               <div field="id" width="120" align="center" headerAlign="center" allowSort="true">ID</div>
                               <div field="code" width="120" align="center" headerAlign="center" allowSort="true">股票代码</div>
                               <div field="secName" width="120" align="center" headerAlign="center" allowSort="true">股票名称</div>
                               <div field="ipoDate" width="120" align="center" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd HH:mm">发行日期</div>
                               <div field="exchCity" width="120" align="center" headerAlign="center" allowSort="true">交易城市</div>
                               <div field="secStatus" width="120" align="center" headerAlign="center" allowSort="true">股票状态</div>
                               <div field="updataDate" width="120" align="center" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd HH:mm">更新日期</div>
                               <div field="maDate" width="120" align="center" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd HH:mm">MA日期</div>
            <div name="action" width="100" renderer="rendererAction" align="center" headerAlign="center">操作</div>
        </div>
    </div>
</div>
</body>
</html>
<script type="text/javascript">
    var accessUpdate =${authorize.module('stock','U')?c};
    var accessDelete =${authorize.module('stock','D')?c};
</script>
<@global.importRequest/>
<@global.resources 'js/stock/list.js'/>