SUMMARY = "IDL Parsing Library"
DESCRIPTION = "LibIDL is a small library for creating parse trees of CORBA \
v2.2-compliant Interface Definition Language (IDL) files. IDL is a \
specification for defining interfaces that can be used between \
different CORBA implementations."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.14"

RPM_NAME = "libIDL-2-0-0.8.14-23.24.aarch64.rpm"
RPM_HASH = "40fb06c6227b57b980c3b4a17ffd11ce5aee2d7621186d13314a58ebd8159577acf48607a18a5ee882fc9c3f0555accfcdb1130b09300bd69a96e5206e24cbbb"

RPROVIDES:${PN} += "libIDL-2-0 \
libIDL-2-0(aarch-64) \
libIDL-2.so.0()(64bit) \
libidl"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
