package krt.wid.nohttp;

import java.util.List;

/**
 * @author Marcus
 * @package krt.wid.nohttp
 * @description
 * @time 2018/2/6
 */

public class Student {

    /**
     * bannerList : [{"picurl":"http://localhost:8080/zhsqapp/skin_new_blue/images/banner4.jpg","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/index!seeUI.do?id=3"}}},{"picurl":"http://localhost:8080/zhsqapp/skin_new_blue/images/banner5.jpg","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/index!seeUI.do?id=4"}}},{"picurl":"http://localhost:8080/zhsqapp/skin_new_blue/images/banner6.jpg","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/index!seeUI.do?id=5"}}},{"picurl":"http://localhost:8080/zhsqapp/skin_new_blue/images/banner2.jpg","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/index!seeUI.do?id=1"}}},{"picurl":"http://localhost:8080/zhsqapp/skin_new_blue/images/banner3.jpg","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/index!seeUI.do?id=2"}}}]
     * hotObj : {"img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/zgld.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}},"list":[{"title":"省发改委在赣州市调研绿色产业发展","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"赣州出台7条新规降低企业用地成本 优化发展环境","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"赣州电子商务培训中心揭牌 将推动赣南电商健康快速发展","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"赣州多条铁路纳入国家《中长期铁路网规划》","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"中心城区小学学区划分有调整 今年新增大公路一小绵江路校区学区","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"\u201c有他们在，我和孙子就能睡安稳觉了\u201d\u2014\u2014暴雨下赣南村庄的不眠之夜","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}}]}
     * mainFunction : [{"title":"办事","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/banshi.png","para":{"type":"url","item":{"url":""}}},{"title":"时间银行","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/sjyh_icon.png","para":{"type":"url","item":{"url":""}}},{"title":"养老","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/yl.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/ylapp/ins!ListUI.do"}}},{"title":"家政","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/jiazheng.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/jzapp/index.jsp"}}},{"title":"城管","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/chengguan.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/app/main.jsp"}}},{"title":"看病","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/kanbing.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/wjapp/index.jsp"}}},{"title":"教育","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/jiaoyu.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/wjapp/index!indexUI.do"}}},{"title":"便民查询","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/bianminchaxun.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/shapp/index.jsp"}}}]
     * sumFunction : [{"title":"企服","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/qifu.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index_new/qyfw.jsp"}}},{"title":"居住","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/juzhu.png","para":{"type":"url","item":{"url":"http://218.204.105.54:8093/zhxq/app/setCommunity_num.jsp"}}},{"title":"出行","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/chuxing.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index_new/travel.jsp"}}},{"title":"旅游","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/lvyou.png","para":{"type":"url","item":{"url":"'https://zhzg.gov.cn/zhsqapp/20160711temp/lyzg.jsp"}}},{"title":"购物","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/gouwu.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/shopapp/zggw.jsp"}}},{"title":"娱乐","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/z-INMenu2-pic17.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/pleasureapp/index.jsp"}}},{"title":"心服务","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/xfw.png","para":{"type":"url","item":{"url":""}}},{"title":"健康养生","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/jkys.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/ylapp/fwxm_list.jsp?fw=4&sfw=&tag=jkys"}}},{"title":"失物招领","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/swzl.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index_new/swzl_ListUI.jsp"}}},{"title":"左邻右舍","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/zlys.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/sq/sq!zlysShow.do"}}},{"title":"办公室","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/bgs.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/zwapp/ldbywy.jsp"}}},{"title":"智慧司法","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/zhsf.png","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/zhsfapp/zhsf!listUI.do"}}},{"title":"在线阅读","img":"https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/z-INMenu2-pic18.png","para":{"type":"url","item":{"url":""}}}]
     */

    private HotObjBean hotObj;
    private List<BannerListBean> bannerList;
    private List<MainFunctionBean> mainFunction;
    private List<SumFunctionBean> sumFunction;

    public HotObjBean getHotObj() {
        return hotObj;
    }

    public void setHotObj(HotObjBean hotObj) {
        this.hotObj = hotObj;
    }

    public List<BannerListBean> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<BannerListBean> bannerList) {
        this.bannerList = bannerList;
    }

    public List<MainFunctionBean> getMainFunction() {
        return mainFunction;
    }

    public void setMainFunction(List<MainFunctionBean> mainFunction) {
        this.mainFunction = mainFunction;
    }

    public List<SumFunctionBean> getSumFunction() {
        return sumFunction;
    }

    public void setSumFunction(List<SumFunctionBean> sumFunction) {
        this.sumFunction = sumFunction;
    }

    public static class HotObjBean {
        /**
         * img : https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/zgld.png
         * para : {"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}
         * list : [{"title":"省发改委在赣州市调研绿色产业发展","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"赣州出台7条新规降低企业用地成本 优化发展环境","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"赣州电子商务培训中心揭牌 将推动赣南电商健康快速发展","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"赣州多条铁路纳入国家《中长期铁路网规划》","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"中心城区小学学区划分有调整 今年新增大公路一小绵江路校区学区","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}},{"title":"\u201c有他们在，我和孙子就能睡安稳觉了\u201d\u2014\u2014暴雨下赣南村庄的不眠之夜","para":{"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}}]
         */

        private String img;
        private ParaBean para;
        private List<ListBean> list;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public ParaBean getPara() {
            return para;
        }

        public void setPara(ParaBean para) {
            this.para = para;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ParaBean {
            /**
             * type : url
             * item : {"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}
             */

            private String type;
            private ItemBean item;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public ItemBean getItem() {
                return item;
            }

            public void setItem(ItemBean item) {
                this.item = item;
            }

            public static class ItemBean {
                /**
                 * url : https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class ListBean {
            /**
             * title : 省发改委在赣州市调研绿色产业发展
             * para : {"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}}
             */

            private String title;
            private ParaBeanX para;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public ParaBeanX getPara() {
                return para;
            }

            public void setPara(ParaBeanX para) {
                this.para = para;
            }

            public static class ParaBeanX {
                /**
                 * type : url
                 * item : {"url":"https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do"}
                 */

                private String type;
                private ItemBeanX item;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public ItemBeanX getItem() {
                    return item;
                }

                public void setItem(ItemBeanX item) {
                    this.item = item;
                }

                public static class ItemBeanX {
                    /**
                     * url : https://zhzg.gov.cn/zhsqapp/index/zx!ListUI.do
                     */

                    private String url;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }
        }
    }

    public static class BannerListBean {
        /**
         * picurl : http://localhost:8080/zhsqapp/skin_new_blue/images/banner4.jpg
         * para : {"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index/index!seeUI.do?id=3"}}
         */

        private String picurl;
        private ParaBeanXX para;

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public ParaBeanXX getPara() {
            return para;
        }

        public void setPara(ParaBeanXX para) {
            this.para = para;
        }

        public static class ParaBeanXX {
            /**
             * type : url
             * item : {"url":"https://zhzg.gov.cn/zhsqapp/index/index!seeUI.do?id=3"}
             */

            private String type;
            private ItemBeanXX item;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public ItemBeanXX getItem() {
                return item;
            }

            public void setItem(ItemBeanXX item) {
                this.item = item;
            }

            public static class ItemBeanXX {
                /**
                 * url : https://zhzg.gov.cn/zhsqapp/index/index!seeUI.do?id=3
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }

    public static class MainFunctionBean {
        /**
         * title : 办事
         * img : https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/banshi.png
         * para : {"type":"url","item":{"url":""}}
         */

        private String title;
        private String img;
        private ParaBeanXXX para;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public ParaBeanXXX getPara() {
            return para;
        }

        public void setPara(ParaBeanXXX para) {
            this.para = para;
        }

        public static class ParaBeanXXX {
            /**
             * type : url
             * item : {"url":""}
             */

            private String type;
            private ItemBeanXXX item;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public ItemBeanXXX getItem() {
                return item;
            }

            public void setItem(ItemBeanXXX item) {
                this.item = item;
            }

            public static class ItemBeanXXX {
                /**
                 * url :
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }

    public static class SumFunctionBean {
        /**
         * title : 企服
         * img : https://zhzg.gov.cn/zhsqapp/skin_new_blue/images/qifu.png
         * para : {"type":"url","item":{"url":"https://zhzg.gov.cn/zhsqapp/index_new/qyfw.jsp"}}
         */

        private String title;
        private String img;
        private ParaBeanXXXX para;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public ParaBeanXXXX getPara() {
            return para;
        }

        public void setPara(ParaBeanXXXX para) {
            this.para = para;
        }

        public static class ParaBeanXXXX {
            /**
             * type : url
             * item : {"url":"https://zhzg.gov.cn/zhsqapp/index_new/qyfw.jsp"}
             */

            private String type;
            private ItemBeanXXXX item;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public ItemBeanXXXX getItem() {
                return item;
            }

            public void setItem(ItemBeanXXXX item) {
                this.item = item;
            }

            public static class ItemBeanXXXX {
                /**
                 * url : https://zhzg.gov.cn/zhsqapp/index_new/qyfw.jsp
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
