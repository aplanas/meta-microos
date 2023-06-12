SUMMARY = "GNU partitioner"
DESCRIPTION = "GNU Parted is a program for creating, destroying, resizing, checking, \
and copying partitions, and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "parted-3.5-4.4.aarch64.rpm"
RPM_HASH = "432371c8a27ad8e796c8a6adbdd46356509a715cead221a443cad30583f8ecc38045684338a02417c6900c3cdfb79482511ff6097344162ac4dd6f267a2f8849"

RPROVIDES:${PN} += "parted \
parted(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libparted-fs-resize.so.0()(64bit) \
libparted-fs-resize.so.0(LIBPARTED_FS_RESIZE_0.0.0)(64bit) \
libparted.so.2()(64bit) \
libreadline.so.8()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
