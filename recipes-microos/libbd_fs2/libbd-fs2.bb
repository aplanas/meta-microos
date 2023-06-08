SUMMARY = "The FS plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to operations with file systems."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_fs2-2.28-1.4.aarch64.rpm"
RPM_HASH = "ec87fe23bd343780cb52f4bef1277b5fa44a198a856c9d3b59d0598f5de93d9c3f1b827b23da591c8b4eb8484fce3a67627eda3df2365f1c8d7124c89d4976e0"

RPROVIDES:${PN} += "libbd_fs.so.2()(64bit) libbd_fs2 libbd_fs2(aarch-64) libblockdev-fs"
RDEPENDS:${PN} += "/sbin/ldconfig device-mapper ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbd_part_err.so.2()(64bit) libbd_utils.so.2()(64bit) libbd_utils2 libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libblkid.so.1(BLKID_2.21)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.21)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libmount.so.1(MOUNT_2.30)(64bit) libparted-fs-resize.so.0()(64bit) libparted-fs-resize.so.0(LIBPARTED_FS_RESIZE_0.0.0)(64bit) libparted.so.2()(64bit)"

inherit rpm
