SUMMARY = "Service granting access to the configuration options of gaming mice"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the daemon managing access to the hardware."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "ratbagd-0.17-1.3.aarch64.rpm"
RPM_HASH = "160a118ff8de4642c7b1fc79e6a320979d9c9d8465ff5eec7716b610ba0552d832d8570c19ea5b2f0bccba85badad467ef45c1c8c799a7b1a0956133a3b06921"

RPROVIDES:${PN} += "ratbagd ratbagd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(games) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libevdev.so.2()(64bit) libevdev.so.2(LIBEVDEV_1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_222)(64bit) libsystemd.so.0(LIBSYSTEMD_227)(64bit) libsystemd.so.0(LIBSYSTEMD_243)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libunistring.so.5()(64bit)"

inherit rpm
