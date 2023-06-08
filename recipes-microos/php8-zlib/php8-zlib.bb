SUMMARY = "Zlib compression support for PHP"
DESCRIPTION = "This module enables to transparently read and write gzip (.gz) \
compressed files, through versions of most of the filesystem \
functions which work with gzip-compressed files (and uncompressed \
files, too, but not with sockets)."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-zlib-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "6430f900832ecd4443004822fd3a3f234aa69372bd472ab3e814293ce28742e55634ce06bbed99b5317401f5b7f43a6d7577566a0b7ce107df4382c6c7cc55dd"

RPROVIDES:${PN} += "config(php8-zlib) php-zlib php8-zlib php8-zlib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libz.so.1()(64bit) php"

inherit rpm
