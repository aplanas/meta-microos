SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the subset library"
LICENSE = "MIT"

PV = "7.2.0"

RPM_NAME = "libharfbuzz-subset0-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "0f252b6d2d830dbde107e08130cadcfc96c203d4372e40b7cd144e105fb91d671b43659d559fbd02241c86382fc90c028bd6503882190c5e635e25b7790205b9"

RPROVIDES:${PN} += "libharfbuzz-subset.so.0()(64bit) libharfbuzz-subset0 libharfbuzz-subset0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
