SUMMARY = "File identification extension for PHP"
DESCRIPTION = "The functions in this module try to guess the content type and \
encoding of a file by looking for certain magic byte sequences at \
specific positions within the file. It uses (a bundled version of) \
libmagic to heuristically determine this."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-fileinfo-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "d72df9711bd4f53f37e37b47a53b4463e0209cb6d240e678d1dfa545dbf6e8634c34c50c7b312c183c32da976e66f2bbcf4c746b30a42eed28781cbcd8e88991"

RPROVIDES:${PN} += "config(php8-fileinfo) php-fileinfo php8-fileinfo php8-fileinfo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) php"

inherit rpm
