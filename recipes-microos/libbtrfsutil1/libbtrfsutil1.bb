SUMMARY = "Utility library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfsutil.so shared library. This library is \
LGPL unlike libbtrfs.so and can be used by applications to interact with Btrfs \
filesystems."
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "libbtrfsutil1-6.1.3-5.1.aarch64.rpm"
RPM_HASH = "248586e3fefcf3881cbab3596a744aefd1136ee0d35ad64cf46a0e76fdc2168b55891e8382a71780644171effa91a944236707120d747de60264edb21ae49d28"

RPROVIDES:${PN} += "libbtrfsutil.so.1()(64bit) libbtrfsutil.so.1(LIBBTRFSUTIL_1.1)(64bit) libbtrfsutil.so.1(LIBBTRFSUTIL_1.2)(64bit) libbtrfsutil1 libbtrfsutil1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
