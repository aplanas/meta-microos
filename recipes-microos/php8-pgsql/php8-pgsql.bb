SUMMARY = "PostgreSQL database client for PHP"
DESCRIPTION = "PHP functions for access to PostgreSQL database servers. It includes \
both traditional pgsql and pdo_pgsql drivers."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-pgsql-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "0476e86607298c472329d720a24ed53b08bc9588d250c511932058590c3fc52f743b28164c264fa00d86679644739fc0ea1c1a1723c1a0fa4ba901bef117c6eb"

RPROVIDES:${PN} += "config(php8-pgsql) php-pdo_pgsql php-pgsql php8-pgsql php8-pgsql(aarch-64) php_any_db"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) php php-pdo"

inherit rpm
