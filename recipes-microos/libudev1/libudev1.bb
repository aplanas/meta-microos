SUMMARY = "Dynamic library to access udev device information"
DESCRIPTION = "This package contains the dynamic library libudev, which provides \
access to udev device information"
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "libudev1-253.4-1.2.aarch64.rpm"
RPM_HASH = "d2c2ab8d83271ae91fbd30e3d3649d812c1effd88cb676a5e146b0112f25f735ced7d8cb3d3748e0540ad185169ba4162fd85d84d1b52a861a15cfd80ee8f1b2"

RPROVIDES:${PN} += "libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libudev.so.1(LIBUDEV_189)(64bit) libudev.so.1(LIBUDEV_196)(64bit) libudev.so.1(LIBUDEV_199)(64bit) libudev.so.1(LIBUDEV_215)(64bit) libudev.so.1(LIBUDEV_247)(64bit) libudev1 libudev1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit)"

inherit rpm
