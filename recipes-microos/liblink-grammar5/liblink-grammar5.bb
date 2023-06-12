SUMMARY = "An English grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of a number of \
languages, based on Link Grammar, an original theory of syntax and \
morphology."
LICENSE = "LGPL-2.1-only"

PV = "5.10.5"

RPM_NAME = "liblink-grammar5-5.10.5-1.5.aarch64.rpm"
RPM_HASH = "0625ac89fabdcdddb384ab881f93b220f36e45dc5c99e0e2c97280a19761c0db1e54550e84f8c99fc20b1e4d8563c5ef2bda9653beb4645e9a3bc33d29e9b893"

RPROVIDES:${PN} += "liblink-grammar.so.5()(64bit) \
liblink-grammar5 \
liblink-grammar5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhunspell-1.7.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
