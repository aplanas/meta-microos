SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libfdisk1-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "7df75b7fd946b622509830447acc92097f1c9e9014061e4162c7f6666a16503fee7dc72b1183d34dc444939b5dbcdf3111d7caf932beca6b2aabd27be3b714c9"

RPROVIDES:${PN} += "libfdisk.so.1()(64bit) libfdisk.so.1(FDISK_2.26)(64bit) libfdisk.so.1(FDISK_2.27)(64bit) libfdisk.so.1(FDISK_2.28)(64bit) libfdisk.so.1(FDISK_2.29)(64bit) libfdisk.so.1(FDISK_2.30)(64bit) libfdisk.so.1(FDISK_2.31)(64bit) libfdisk.so.1(FDISK_2.32)(64bit) libfdisk.so.1(FDISK_2.33)(64bit) libfdisk.so.1(FDISK_2.35)(64bit) libfdisk.so.1(FDISK_2.36)(64bit) libfdisk.so.1(FDISK_2.38)(64bit) libfdisk1 libfdisk1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libblkid.so.1(BLKID_2.21)(64bit) libc.so.6(GLIBC_2.33)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
