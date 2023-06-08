SUMMARY = "C library for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
GPIO mockup library part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiomockup0-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "a38959255ce3ec89e80a0a2f1f2d12a358f28fef6a51d4184a822b5f57105d0ad58b394bc2966b1540501e8aa28574940d50717c74febf514fa59b26e529808b"

RPROVIDES:${PN} += "libgpiomockup.so.0()(64bit) libgpiomockup0 libgpiomockup0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkmod.so.2()(64bit) libkmod.so.2(LIBKMOD_5)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
