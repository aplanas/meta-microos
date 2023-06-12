SUMMARY = "Generic buffer management API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libgbm1-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "49caa66ecf0b3a5e4e82a8b85b9894b663bc665128cd082c03d24c1159f3ade5c4e097dbf9f85c046990a688ea436b925497d1445da14dcb538a849130e79d06"

RPROVIDES:${PN} += "libgbm.so.1()(64bit) \
libgbm1 \
libgbm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libwayland-server.so.0()(64bit)"

inherit rpm
