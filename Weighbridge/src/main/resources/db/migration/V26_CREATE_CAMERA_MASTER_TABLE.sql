CREATE TABLE camera_master (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    companyId VARCHAR(255) NOT NULL,
    siteId VARCHAR(255) NOT NULL,
    roleId VARCHAR(255) NOT NULL,
    url1 VARCHAR(255),
    url2 VARCHAR(255),
    url3 VARCHAR(255),
    url4 VARCHAR(255)
);
