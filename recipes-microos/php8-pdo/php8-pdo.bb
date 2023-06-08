SUMMARY = "PHP Data Objects extension for PHP"
DESCRIPTION = "The PHP Data Objects (PDO) extension defines an interface for \
accessing databases in PHP. Each database driver that implements the \
PDO interface can expose database-specific features as regular \
extension functions. Note that you use a database-specific PDO driver \
to access a database server. \
 \
PDO provides a data-access abstraction layer, which means that, \
regardless of the database used, you use the same functions to issue \
queries and fetch data. PDO does not provide a database abstraction; \
it does not rewrite SQL or emulate missing features."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-pdo-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "33fa0974bbf6af941425fd4d19dfa19708e8a02b3b27076037e68c741d626e24ae07d2864ea3dc2d57d56cf592bd4a46f9a996b64f10a6a9c9682fc657503081"

RPROVIDES:${PN} += "config(php8-pdo) php-pdo php8-pdo php8-pdo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
