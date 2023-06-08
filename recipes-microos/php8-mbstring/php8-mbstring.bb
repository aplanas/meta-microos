SUMMARY = "Multibyte string functions for PHP"
DESCRIPTION = "mbstring provides multibyte specific string functions that help \
dealing with multibyte encodings in PHP. mbstring handles character \
encoding conversion between the possible encoding pairs. mbstring \
handles Unicode-based encodings such as UTF-8 and UCS-2 and many \
single-byte encodings for convenience."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-mbstring-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "156cb5f895cbe5a5f01f54b4784324cbee8ab2a3f5430fb582c012ba07093db7148d94510cbe3f17fe9609297c1991f282a04cf8828dadb767e887f4a04294b6"

RPROVIDES:${PN} += "config(php8-mbstring) php-mbstring php8-mbstring php8-mbstring(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libonig.so.5()(64bit) php"

inherit rpm
