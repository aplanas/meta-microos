SUMMARY = "Yet Another JSON Library"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl2-2.1.0-6.5.aarch64.rpm"
RPM_HASH = "4e0c0dc6da3fbeb2b1803b7137e8d296f0721a8484422bc78a41a9dd433d347e699f2c516f77a6a95535f51bb2d432665c89d2c59339c088a4bd4598628eab24"

RPROVIDES:${PN} += "libyajl.so.2()(64bit) libyajl2 libyajl2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
