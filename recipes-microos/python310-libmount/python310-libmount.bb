SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "python310-libmount-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "bb056254585ad34415f1934c84b0f3c19b76189e9944b64ce3e8fab9b0b600646d0aefae3abccac3965cc88c668b2a3894628499f921936a586caef61fa1e738"

RPROVIDES:${PN} += "python3-libmount python310-libmount python310-libmount(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.21)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libmount.so.1(MOUNT_2.23)(64bit) libmount.so.1(MOUNT_2.24)(64bit) permissions python(abi)"

inherit rpm
