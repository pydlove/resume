    /* 动态创建模态框 */
    function createModal(id,method_name,width,height,title,iframe,keyboard){
        var modal = '<div class="modal fade" id="' + id + '" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">' +
                        '<div class="modal-dialog modal-lg"  style="width:' + width + 'px;height:' + height + 'px;">' +
                            '<div class="modal-content">' +
                            '   <div class="modal-header" style="background-color: #7bee7a;color: #ffffff;">' +
                                    '<button type="button" class="close" data-dismiss="modal" aria-hidden="true">' +
                                        '&times;' +
                                    '</button>' +
                                    '<h4 class="modal-title" id="myModalLabel">' +
                                        title +
                                     '</h4>' +
                                 '</div>' +
                                '<div class="modal-body">' +
                                    iframe +
                                '</div>' +
                                '<div class="modal-footer" style="background-color:#7bee7a;">' +
                                    '<button  type="button" class="btn btn-default" data-dismiss="modal">关闭</button>' +
                                    '<button  type="button" class="btn btn-primary" onclick="'+ method_name +'();">确定</button>' +
                            '   </div>' +
                            '</div>' +
                        '</div>' +
                     '</div>';
        console.log(modal)
        $(document.body).append(modal);
        /*   其中 ，backdrop：’static’指的是点击背景空白处不被关闭；
        keyboard:false指的是触发键盘esc事件时不关闭。 */
        $('#'+id).modal({
            backdrop: 'static',
            keyboard: keyboard
        })
    }

    /* 清空模态框回溯 */
    function clearForm(iframe_id) {
        var form = $("#"+iframe_id).contents().find("form");
        // 迭代input清空
        $(':input', form).each(function() {
            var type = this.type;
            var tag = this.tagName.toLowerCase(); // normalize case
            if (type == 'text' || type == 'password' || tag == 'textarea')
                this.value = "";
            // 跌代多选checkboxes
            else if (type == 'checkbox' || type == 'radio')
                this.checked = false;
            // select 迭代下拉框
            else if (tag == 'select')
                this.selectedIndex = -1;
        });
    }


    function createFrame(url, frameId, width, height){
        var iframe = "<iframe id='" + frameId + "' src='" + url + "' name='mainFrame' " +
                         " frameborder='0' marginheight='0' marginwidth='0' " +
                         "style='height:" + height + "px;width: " + width + "px' ></iframe>";
        return iframe;
    }