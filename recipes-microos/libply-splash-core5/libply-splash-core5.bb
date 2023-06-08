SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-splash-core library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-core5-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "cba2dce3dca312819fa400f895b424d86faa448a06caa23b1e6688eef5c9529fec93162731a69514dfcd1039d3c80f0abd65759df232894bddd5d35d69d57bb3"

RPROVIDES:${PN} += "libply-splash-core.so.5()(64bit) libply-splash-core5 libply-splash-core5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libply.so.5()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
