SUMMARY = "Native language support for PHP"
DESCRIPTION = "PHP functions that implement a Native Language Support (NLS) API which \
can be used to internationalize your PHP applications."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-gettext-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "4c4c9def3ba4c32437b222a7f462a0aac3697c81bf14a091a90366bcaf4c6dd8b02d9b54ef11043fb6a1d17a2aaf117a8c7b35e881dc2d28e76a2daabd7a0f1b"

RPROVIDES:${PN} += "config(php8-gettext) \
php-gettext \
php8-gettext \
php8-gettext(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
php"

inherit rpm
