SUMMARY = "An OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the subset library"
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "libharfbuzz-subset0-7.3.0-1.2.aarch64.rpm"
RPM_HASH = "7b3b5ae2c3de816c996b9ea113b04217426eb1e227fb3b072900e9682873f6ae244609d7f83f9ffb1f7ce1221a017da4ce6863ebfc926bec56b6954e770b9abd"

RPROVIDES:${PN} += "libharfbuzz-subset.so.0()(64bit) \
libharfbuzz-subset0 \
libharfbuzz-subset0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libharfbuzz.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
