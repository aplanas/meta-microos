SUMMARY = "Python bindings for developing with libbtrfsutil"
DESCRIPTION = "This package contains the python bindings to build applications to interface \
with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "python-btrfsutil-6.1.3-5.1.aarch64.rpm"
RPM_HASH = "a66c0bcb60d5ecae729dff7ebc70fe6af6cdbdcc4f9e052b07c4c37223833e6dcff5af748ba43a84e99ea9bdc12599c3cc9bbfec920e8ddea1d09d80dc7bb6be"

RPROVIDES:${PN} += "python-btrfsutil python-btrfsutil(aarch-64) python3.10dist(btrfsutil) python3dist(btrfsutil)"
RDEPENDS:${PN} += "btrfsprogs ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbtrfsutil.so.1()(64bit) libbtrfsutil.so.1(LIBBTRFSUTIL_1.1)(64bit) libbtrfsutil1 libc.so.6(GLIBC_2.17)(64bit) python(abi) python3"

inherit rpm
