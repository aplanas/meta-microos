SUMMARY = "ZIP archive support for PHP"
DESCRIPTION = "This extension allows to transparently read or write ZIP compressed \
archives and the files inside them."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-zip-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "225c95e598878b2f521e83f05c072cf1f5df85b38309022e2c1a420570b4147a40f0bc153e7058a2d1c803d902ebf55b316c6b9db9c663a4b944fe45b7f46bf8"

RPROVIDES:${PN} += "config(php8-zip) php-zip php8-zip php8-zip(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libzip.so.5()(64bit) php"

inherit rpm
