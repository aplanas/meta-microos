SUMMARY = "MySQL database client for PHP"
DESCRIPTION = "PHP functions for access to MySQL database servers."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-mysql-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "0d720182ce2889a296aacc0c10a1ea0e8b57eb74c684144679d66a5e3ce2f33ce87a50b9e3b28a224553e8fc7ecca261963c351cb4ede13ef8c6b4105193f2cb"

RPROVIDES:${PN} += "config(php8-mysql) php-mysql php-mysqli php-pdo_mysql php8-mysql php8-mysql(aarch-64) php_any_db"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php php-pdo"

inherit rpm
