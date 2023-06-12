SUMMARY = "PHP bzip2 codec support"
DESCRIPTION = "PHP functions to read and write bzip2 (.bz2) compressed files."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-bz2-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "f7f5dcfccfdcfe1265e719dd048eb6d82897ae945c490211965a799d39ccd8bbfb4de9f3d6bf68b375d29f35bd5551387506481ce0829d157d8dcd644c4dc06e"

RPROVIDES:${PN} += "config(php8-bz2) \
php-bz2 \
php8-bz2 \
php8-bz2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
php"

inherit rpm
