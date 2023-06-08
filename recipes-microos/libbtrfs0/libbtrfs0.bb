SUMMARY = "Library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfs.so shared library needed for some \
applications to interface with btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "libbtrfs0-6.1.3-5.1.aarch64.rpm"
RPM_HASH = "6392b6101a31276df71ae55095fed51741b35d685029b9e5f01e5b4215c289ceda6d4597e52fccf02034b40f7b0e1f3f15773fc35c13c3a893ef100d46875da2"

RPROVIDES:${PN} += "libbtrfs.so.0()(64bit) libbtrfs.so.0(LIBBTRFS_0.1)(64bit) libbtrfs0 libbtrfs0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
