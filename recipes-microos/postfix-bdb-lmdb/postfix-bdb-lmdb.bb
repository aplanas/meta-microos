SUMMARY = "Postfix plugin to support LMDB maps"
DESCRIPTION = "Postfix plugin to support LMDB maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
lmdb."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-bdb-lmdb-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "ccba60928d9d4e98f16c75d111176fdf671a6fdcbd5b3b8d9235119a65ad989343384b2b202c0c6e557ac158d8851c69f08011d823a5674b61568112c8a8799d"

RPROVIDES:${PN} += "postfix-bdb-lmdb postfix-bdb-lmdb(aarch-64) postfix-lmdb"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) liblmdb-0.9.30.so()(64bit) postfix-bdb"

inherit rpm
