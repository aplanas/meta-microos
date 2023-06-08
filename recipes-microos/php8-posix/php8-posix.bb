SUMMARY = "POSIX functions for PHP"
DESCRIPTION = "This module contains an interface to those functions defined in the \
IEEE 1003.1 (POSIX.1) standards document which are not accessible \
through other means."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-posix-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "b793820b24a9a0b687f1143f9b38112a958d843151539c27f64e8f061df85dcff62b3c04cb075e8a74933c4e63cece4b308be1324c4ae71df5286c9927e92645"

RPROVIDES:${PN} += "config(php8-posix) php-posix php8-posix php8-posix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) php"

inherit rpm
