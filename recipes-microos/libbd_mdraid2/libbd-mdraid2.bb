SUMMARY = "The MD RAID plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to MD RAID."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_mdraid2-2.28-1.4.aarch64.rpm"
RPM_HASH = "08b8279b990ef1a9a846055e65b90624a2280e80ccd4a822f95863cb64c3e05560bc05c52732e1fa4046ae74c951c6f80b7356c377eddd22ec2390a27eb7ebc9"

RPROVIDES:${PN} += "libbd_mdraid.so.2()(64bit) \
libbd_mdraid2 \
libbd_mdraid2(aarch-64) \
libblockdev-mdraid"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbd_utils.so.2()(64bit) \
libbd_utils2 \
libbytesize.so.1()(64bit) \
libc.so.6(GLIBC_2.27)(64bit) \
libglib-2.0.so.0()(64bit) \
mdadm"

inherit rpm
