<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta charset="utf-8"/>
    <title>管理员控制台</title>
    <meta name="description" content="overview &amp; stats"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon">
    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="/assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"/>
    <!-- page specific plugin styles -->
    <!-- text fonts -->
    <link rel="stylesheet" href="/assets/css/google-fonts.css"/>
    <!-- ace styles -->
    <link rel="stylesheet" href="/assets/css/ace.min.css"/>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="/assets/css/ace-part2.min.css"/>
    <![endif]-->
    <link rel="stylesheet" href="/assets/css/ace-skins.min.css"/>
    <link rel="stylesheet" href="/assets/css/ace-rtl.min.css"/>
    <link rel="stylesheet" href="/assets/css/jquery.gritter.css" />
    <link rel="stylesheet" href="/assets/css/jquery-ui.min.css" />
    <link rel="stylesheet" href="/assets/css/chosen.css" />
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="/assets/css/ace-ie.min.css"/>
    <![endif]-->
    <!-- inline styles related to this page -->
    <!-- ace settings handler -->
    <script src="/assets/js/ace-extra.min.js"></script>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lte IE 8]>
    <script src="/js/html5shiv.min.js"></script>
    <script src="/js/respond.min.js"></script>
    <![endif]-->

    <script src="/js/jquery-1.9.1.min.js"></script>
    <script src="/assets/js/jquery-ui.min.js"></script>
    <script src="/assets/js/jquery.gritter.min.js"></script>
    <script src="/assets/js/chosen.jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/mustache.js/2.2.1/mustache.js"></script>
    <script src="/bootstrap3.3.5/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        // 展示提示信息
        function showMessage(title, msg, isSuccess) {
            if (!isSuccess) {
                msg = msg || '';
            } else {
                msg = msg || '操作成功'
            }
            $.gritter.add({
                title: title,
                text: msg != '' ? msg : "服务器处理异常, 建议刷新页面来保证数据是最新的",
                time: '',
                class_name: (isSuccess ? 'gritter-success' : 'gritter-warning') + (!$('#gritter-light').get(0).checked ? ' gritter-light' : '')
            });
        }
    </script>
</head>
<body class="no-skin" youdao="bind" style="background: white">
<input id="gritter-light" checked="" type="checkbox" class="ace ace-switch ace-switch-5"/>

<div class="page-header">
    <h1>
        用户管理
        <small>
            <i class="ace-icon fa fa-angle-double-right"></i>
            维护部门与用户关系
        </small>
    </h1>
</div>
<div class="main-content-inner">
    <div class="col-sm-3">
        <div class="table-header">
            部门列表&nbsp;&nbsp;
            <a class="green" href="#">
                <i class="ace-icon fa fa-plus-circle orange bigger-130 dept-add"></i>
            </a>
        </div>
        <div id="deptList">
        </div>
    </div>
    <div class="col-sm-9">
        <div class="col-xs-12">
            <div class="table-header">
                用户列表&nbsp;&nbsp;
                <a class="green" href="#">
                    <i class="ace-icon fa fa-plus-circle orange bigger-130 user-add"></i>
                </a>
            </div>
            <div>
                <div id="dynamic-table_wrapper" class="dataTables_wrapper form-inline no-footer">
                    <div class="row">
                        <div class="col-xs-6">
                            <div class="dataTables_length" id="dynamic-table_length"><label>
                                展示
                                <select id="pageSize" name="dynamic-table_length" aria-controls="dynamic-table" class="form-control input-sm">
                                    <option value="10">10</option>
                                    <option value="25">25</option>
                                    <option value="50">50</option>
                                    <option value="100">100</option>
                                </select> 条记录 </label>
                            </div>
                        </div>
                    </div>
                    <table id="dynamic-table" class="table table-striped table-bordered table-hover dataTable no-footer" role="grid"
                           aria-describedby="dynamic-table_info" style="font-size:14px">
                        <thead>
                        <tr role="row">
                            <th tabindex="0" aria-controls="dynamic-table" rowspan="1" colspan="1">
                                姓名
                            </th>
                            <th tabindex="0" aria-controls="dynamic-table" rowspan="1" colspan="1">
                                所属部门
                            </th>
                            <th tabindex="0" aria-controls="dynamic-table" rowspan="1" colspan="1">
                                邮箱
                            </th>
                            <th tabindex="0" aria-controls="dynamic-table" rowspan="1" colspan="1">
                                电话
                            </th>
                            <th tabindex="0" aria-controls="dynamic-table" rowspan="1" colspan="1">
                                状态
                            </th>
                            <th class="sorting_disabled" rowspan="1" colspan="1" aria-label=""></th>
                        </tr>
                        </thead>
                        <tbody id="userList"></tbody>
                    </table>
                    <div class="row" id="userPage">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="dialog-dept-form" style="display: none;">
    <form id="deptForm">
        <table class="table table-striped table-bordered table-hover dataTable no-footer" role="grid">
            <tr>
                <td style="width: 80px;"><label for="parentId">上级部门</label></td>
                <td>
                    <select id="parentId" name="parentId" data-placeholder="选择部门" style="width: 200px;"></select>
                    <input type="hidden" name="id" id="deptId"/>
                </td>
            </tr>
            <tr>
                <td><label for="deptName">名称</label></td>
                <td><input type="text" name="name" id="deptName" value="" class="text ui-widget-content ui-corner-all"></td>
            </tr>
            <tr>
                <td><label for="deptSeq">顺序</label></td>
                <td><input type="text" name="seq" id="deptSeq" value="1" class="text ui-widget-content ui-corner-all"></td>
            </tr>
            <tr>
                <td><label for="deptRemark">备注</label></td>
                <td><textarea name="remark" id="deptRemark" class="text ui-widget-content ui-corner-all" rows="3" cols="25"></textarea></td>
            </tr>
        </table>
    </form>
</div>
<div id="dialog-user-form" style="display: none;">
    <form id="userForm">
        <table class="table table-striped table-bordered table-hover dataTable no-footer" role="grid">
            <tr>
                <td style="width: 80px;"><label for="parentId">所在部门</label></td>
                <td>
                    <select id="deptSelectId" name="deptId" data-placeholder="选择部门" style="width: 200px;"></select>
                </td>
            </tr>
            <tr>
                <td><label for="userName">名称</label></td>
                <input type="hidden" name="id" id="userId"/>
                <td><input type="text" name="username" id="userName" value="" class="text ui-widget-content ui-corner-all"></td>
            </tr>
            <tr>
                <td><label for="userMail">邮箱</label></td>
                <td><input type="text" name="mail" id="userMail" value="" class="text ui-widget-content ui-corner-all"></td>
            </tr>
            <tr>
                <td><label for="userTelephone">电话</label></td>
                <td><input type="text" name="telephone" id="userTelephone" value="" class="text ui-widget-content ui-corner-all"></td>
            </tr>
            <tr>
                <td><label for="userStatus">状态</label></td>
                <td>
                    <select id="userStatus" name="status" data-placeholder="选择状态" style="width: 150px;">
                        <option value="1">有效</option>
                        <option value="0">无效</option>
                        <option value="2">删除</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><label for="userRemark">备注</label></td>
                <td><textarea name="remark" id="userRemark" class="text ui-widget-content ui-corner-all" rows="3" cols="25"></textarea></td>
            </tr>
        </table>
    </form>
</div>
<script id="deptListTemplate" type="x-tmpl-mustache">
<ol class="dd-list">
    {{#deptList}}
        <li class="dd-item dd2-item dept-name" id="dept_{{id}}" href="javascript:void(0)" data-id="{{id}}">
            <div class="dd2-content" style="cursor:pointer;">
            {{name}}
            <span style="float:right;">
                <a class="green dept-edit" href="#" data-id="{{id}}" >
                    <i class="ace-icon fa fa-pencil bigger-100"></i>
                </a>
                &nbsp;
                <a class="red dept-delete" href="#" data-id="{{id}}" data-name="{{name}}">
                    <i class="ace-icon fa fa-trash-o bigger-100"></i>
                </a>
            </span>
            </div>
        </li>
    {{/deptList}}
</ol>
</script>
<script>
    $(function () {
        var deptList; //储存树形部门列表
        var deptMap={}; //储存map格式部门信息
        var deptListTemplate=$("#deptListTemplate");
        Mustache.parse(deptListTemplate)
        loadDeptTree();
        function loadDeptTree() {
            $.ajax({
                url:"/sys/dept/tree.json",
                success:function (result) {
                    if(result.state){
                        deptList=result.data;
                        var rendered=Mustache.render(deptListTemplate,{deptList:result.data})
                    }else{
                        alert("加载失败")
                    }
                }
            })
            
        }
        //递归渲染部门树结构
        function recursiverRenderDept(deptList) {
            if(deptList&&deptList.length>0){

                $(deptList).each(function (i, dept) {
                    deptMap[dept.id]=dept;
                    if(dept.deptList.length>0){
                        var rendered=Mustache.render(deptListTemplate,{deptList:dept.deptList})

                    }
                })
            }
        }
    })
</script>
</body>
</html>
