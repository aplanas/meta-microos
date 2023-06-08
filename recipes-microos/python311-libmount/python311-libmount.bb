SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "python311-libmount-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "d720bf119bc5ab527e468c4090e3f770e15b11a2beea7453ab531608ac130490e6b5f5c2b77213215633ba23b79d809a37cc98aa628d8e687fc2056216162dea"

RPROVIDES:${PN} += "python311-libmount python311-libmount(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.21)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libmount.so.1(MOUNT_2.23)(64bit) libmount.so.1(MOUNT_2.24)(64bit) permissions python(abi)"

inherit rpm
