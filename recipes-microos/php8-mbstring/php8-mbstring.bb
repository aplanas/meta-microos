SUMMARY = "Multibyte string functions for PHP"
DESCRIPTION = "mbstring provides multibyte specific string functions that help \
dealing with multibyte encodings in PHP. mbstring handles character \
encoding conversion between the possible encoding pairs. mbstring \
handles Unicode-based encodings such as UTF-8 and UCS-2 and many \
single-byte encodings for convenience."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-mbstring-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "3201f6f4d4d0e4868acbfb5327676971564ce7ab5d9b1ea95b3c429a672110bb0c317e4c5cb79eccd9ced26c28b49bc47bd341ed2b8ee0edd2631b1124974180"

RPROVIDES:${PN} += "config(php8-mbstring) php-mbstring php8-mbstring php8-mbstring(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libonig.so.5()(64bit) php"

inherit rpm
