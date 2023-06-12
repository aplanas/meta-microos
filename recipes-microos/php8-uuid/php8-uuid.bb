SUMMARY = "PHP UUID support functions"
DESCRIPTION = "This extension provides functions to generate and analyse \
universally unique identifiers (UUIDs)."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "php8-uuid-1.2.0-2.4.aarch64.rpm"
RPM_HASH = "8aa9daa135458b1c8e7a48451c6197a5e8c146586690d6ac6ceec5b8b468be8a79550d5bbfaa3c8b1f0c5d98edf49588656b36a5110301feaa267e4d4564dacb"

RPROVIDES:${PN} += "config(php8-uuid) \
php-uuid \
php8-uuid \
php8-uuid(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libuuid.so.1(UUID_2.31)(64bit) \
php(api) \
php(zend-abi)"

inherit rpm
