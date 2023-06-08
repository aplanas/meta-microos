SUMMARY = "Device mount library"
DESCRIPTION = "Library designed to be used in low-level utils like \
mount(8) and /usr/sbin/mount.<type> helpers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libmount1-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "2138d6f4b0561b2c43c9c5ce7786d07476a635f4c2696d5f976d6e02657d7bfa2ba043f54638fd514fce65fe17b549d05d49cb996cddc19ff5ae8b5d9c0e1576"

RPROVIDES:${PN} += "libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.21)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libmount.so.1(MOUNT_2.23)(64bit) libmount.so.1(MOUNT_2.24)(64bit) libmount.so.1(MOUNT_2.25)(64bit) libmount.so.1(MOUNT_2.26)(64bit) libmount.so.1(MOUNT_2.28)(64bit) libmount.so.1(MOUNT_2.30)(64bit) libmount.so.1(MOUNT_2.33)(64bit) libmount.so.1(MOUNT_2.34)(64bit) libmount.so.1(MOUNT_2_35)(64bit) libmount.so.1(MOUNT_2_37)(64bit) libmount.so.1(MOUNT_2_38)(64bit) libmount1 libmount1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
