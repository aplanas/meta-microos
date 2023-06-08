SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "python39-libmount-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "67f29b04518d66f44b04a2cf6418778ba88e247b9c0dcf30f2024344b4791d0cc5cc96886e9db8806ae3d2031680fd6d4941c50b5a872bbb49bed243326a869a"

RPROVIDES:${PN} += "python39-libmount python39-libmount(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.21)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libmount.so.1(MOUNT_2.23)(64bit) libmount.so.1(MOUNT_2.24)(64bit) permissions python(abi)"

inherit rpm
