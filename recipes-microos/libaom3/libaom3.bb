SUMMARY = "AV1 codec library"
DESCRIPTION = "This is a library for AOMedia Video 1 (AV1), an open, royalty-free \
video coding format designed for video transmissions over the Internet."
LICENSE = "BSD-2-Clause"

PV = "3.6.0"

RPM_NAME = "libaom3-3.6.0-2.1.aarch64.rpm"
RPM_HASH = "07ea9042b47baca8e1fcab948cfec011b66c1645350fbf7616985166d4fa589702ad1d455ec3c8ec7b31b5f79dc7eb53bdbdefd56daf7bb4225601ef02f4f93e"

RPROVIDES:${PN} += "libaom.so.3()(64bit) libaom3 libaom3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
