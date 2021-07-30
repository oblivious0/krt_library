package krt.wid.nohttp;

/**
 * @author Marcus
 * @package krt.wid.nohttp
 * @description
 * @time 2018/9/7
 */
public class UserInfo {
    /**
     * sex : 男
     * phone : 13033260792
     * schoolName : 铁路小学
     * name : 刘锋
     * img : http://223.84.197.214:80/group1/M00/00/09/rAA0RFubW-mAZUjIAAAGdIXuEEU265.png
     * roleName : 普通老师
     * user : {"id":1086,"inserter":255,"insertTime":"2018-03-31 16:01:59","updater":255,"updateTime":"2018-10-15 09:35:17","username":"360602198010031016","password":"253B27279251BD3D911ABEC192D012CF","name":"刘锋","status":"0","roleCode":"teacher","organizationCode":"360101014","regionCode":"360702","dataid":1959,"phone":"13033260792","shutup":1,"img":"","krtNo":"","orgDepartType":""}
     */

    private String sex;
    private String phone;
    private String schoolName;
    private String name;
    private String img;
    private String roleName;
    private UserBean user;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * id : 1086
         * inserter : 255
         * insertTime : 2018-03-31 16:01:59
         * updater : 255
         * updateTime : 2018-10-15 09:35:17
         * username : 360602198010031016
         * password : 253B27279251BD3D911ABEC192D012CF
         * name : 刘锋
         * status : 0
         * roleCode : teacher
         * organizationCode : 360101014
         * regionCode : 360702
         * dataid : 1959
         * phone : 13033260792
         * shutup : 1
         * img :
         * krtNo :
         * orgDepartType :
         */

        private int id;
        private int inserter;
        private String insertTime;
        private int updater;
        private String updateTime;
        private String username;
        private String password;
        private String name;
        private String status;
        private String roleCode;
        private String organizationCode;
        private String regionCode;
        private int dataid;
        private String phone;
        private int shutup;
        private String img;
        private String krtNo;
        private String orgDepartType;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getInserter() {
            return inserter;
        }

        public void setInserter(int inserter) {
            this.inserter = inserter;
        }

        public String getInsertTime() {
            return insertTime;
        }

        public void setInsertTime(String insertTime) {
            this.insertTime = insertTime;
        }

        public int getUpdater() {
            return updater;
        }

        public void setUpdater(int updater) {
            this.updater = updater;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getRoleCode() {
            return roleCode;
        }

        public void setRoleCode(String roleCode) {
            this.roleCode = roleCode;
        }

        public String getOrganizationCode() {
            return organizationCode;
        }

        public void setOrganizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
        }

        public String getRegionCode() {
            return regionCode;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        public int getDataid() {
            return dataid;
        }

        public void setDataid(int dataid) {
            this.dataid = dataid;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getShutup() {
            return shutup;
        }

        public void setShutup(int shutup) {
            this.shutup = shutup;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getKrtNo() {
            return krtNo;
        }

        public void setKrtNo(String krtNo) {
            this.krtNo = krtNo;
        }

        public String getOrgDepartType() {
            return orgDepartType;
        }

        public void setOrgDepartType(String orgDepartType) {
            this.orgDepartType = orgDepartType;
        }
    }
}
