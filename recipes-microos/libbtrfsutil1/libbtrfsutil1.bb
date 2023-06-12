SUMMARY = "Utility library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfsutil.so shared library. This library is \
LGPL unlike libbtrfs.so and can be used by applications to interact with Btrfs \
filesystems."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfsutil1-6.3-1.1.aarch64.rpm"
RPM_HASH = "ab0619901707fcc912af722ad2cc47657e479b49abfa8462ddaea58209560b3257a0d8d57acf5f6bad3ff7ef780c0e696fd532c72c174a2982dc98df37519c6e"

RPROVIDES:${PN} += "libbtrfsutil.so.1()(64bit) \
libbtrfsutil.so.1(LIBBTRFSUTIL_1.1)(64bit) \
libbtrfsutil.so.1(LIBBTRFSUTIL_1.2)(64bit) \
libbtrfsutil1 \
libbtrfsutil1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
