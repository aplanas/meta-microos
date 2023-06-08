SUMMARY = "Library package for libopusenc"
DESCRIPTION = "A library that provides a way to encode Ogg Opus files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "libopusenc0-0.2.1-1.16.aarch64.rpm"
RPM_HASH = "bf0a92fe02c08c2279341792205a9546db532af3791f9ebe51be7852aa3bc71c57dc7e109854ea2c5e269ec3eb4e3d1c4251ccca31d94894d3d52ad45abce9b6"

RPROVIDES:${PN} += "libopusenc.so.0()(64bit) libopusenc0 libopusenc0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopus.so.0()(64bit)"

inherit rpm
