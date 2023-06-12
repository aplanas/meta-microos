SUMMARY = "A DVD Navigation Library"
DESCRIPTION = "This library contains functions to display DVD video menus."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "libdvdnav4-6.1.1-1.9.aarch64.rpm"
RPM_HASH = "208afed0c2ddeae202f133052a180c1c6819cb794d7284cfefd697bd14206511103d8325ff624905a5982d98d4bffd4c5cda9942eddc24cf821b6d3fd7de8697"

RPROVIDES:${PN} += "libdvdnav \
libdvdnav.so.4()(64bit) \
libdvdnav4 \
libdvdnav4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdvdread.so.8()(64bit)"

inherit rpm
