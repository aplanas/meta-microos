SUMMARY = "Linux kernel trace file system library"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system."
LICENSE = "LGPL-2.1-only"

PV = "1.6.4"

RPM_NAME = "libtracefs1-1.6.4-2.3.aarch64.rpm"
RPM_HASH = "b250426c53dbf7d6929ee26a5a84565ec10d6493ea485297d0d3c21b02161803124329ab1d180ec1a4514b8df52bacdd124d623dc39c8bf9071132baa6d9a9bd"

RPROVIDES:${PN} += "libtracefs.so.1()(64bit) \
libtracefs1 \
libtracefs1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libtraceevent.so.1()(64bit)"

inherit rpm
