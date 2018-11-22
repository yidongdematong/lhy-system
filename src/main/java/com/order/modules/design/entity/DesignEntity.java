package com.order.modules.design.entity;

public class DesignEntity {
    private Long id;

    private String designTitle;

    private String designLogo;

    private Integer designType;

    private String coverImgPath;

    private Integer coverImgHeight;

    private String productDesc;

    private String customName;

    private String customService;

    private String industryName;

    private Long createdDate;

    private String productDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignTitle() {
        return designTitle;
    }

    public void setDesignTitle(String designTitle) {
        this.designTitle = designTitle == null ? null : designTitle.trim();
    }

    public String getDesignLogo() {
        return designLogo;
    }

    public void setDesignLogo(String designLogo) {
        this.designLogo = designLogo == null ? null : designLogo.trim();
    }

    public Integer getDesignType() {
        return designType;
    }

    public void setDesignType(Integer designType) {
        this.designType = designType;
    }

    public String getCoverImgPath() {
        return coverImgPath;
    }

    public void setCoverImgPath(String coverImgPath) {
        this.coverImgPath = coverImgPath == null ? null : coverImgPath.trim();
    }

    public Integer getCoverImgHeight() {
        return coverImgHeight;
    }

    public void setCoverImgHeight(Integer coverImgHeight) {
        this.coverImgHeight = coverImgHeight;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    public String getCustomService() {
        return customService;
    }

    public void setCustomService(String customService) {
        this.customService = customService == null ? null : customService.trim();
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail == null ? null : productDetail.trim();
    }
}