SUMMARY = "Utilities for NILFS"
DESCRIPTION = "This package contains utility programs for NILFS v2."
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "nilfs-utils-2.2.9-1.4.aarch64.rpm"
RPM_HASH = "e2a90f126c520aa4cfecd3ac9169c0272e0642addb12e00660a623c2097d45b2215a10209c8f5a8c3a7342bdb87ca2bf6832b1bb9c818c207b3fca264d30237e"

RPROVIDES:${PN} += "config(nilfs-utils) nilfs-utils nilfs-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libnilfs.so.0()(64bit) libnilfscleaner.so.0()(64bit) libnilfsgc.so.0()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
