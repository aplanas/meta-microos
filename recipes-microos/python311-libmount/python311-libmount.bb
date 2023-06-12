SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "python311-libmount-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "6d1a66afa724c89d6646ba118931dc7571e9ae6ba9dee3ed0acc7fc46c946fd47f16dd1759dbaf1575c08730a18a4c1bf5c205e4ef700db396a8a0a64cab2c7a"

RPROVIDES:${PN} += "python311-libmount \
python311-libmount(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2.19)(64bit) \
libmount.so.1(MOUNT_2.20)(64bit) \
libmount.so.1(MOUNT_2.21)(64bit) \
libmount.so.1(MOUNT_2.22)(64bit) \
libmount.so.1(MOUNT_2.23)(64bit) \
libmount.so.1(MOUNT_2.24)(64bit) \
permissions \
python(abi)"

inherit rpm
