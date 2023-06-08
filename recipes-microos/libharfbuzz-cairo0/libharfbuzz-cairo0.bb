SUMMARY = "Cairo integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the Cairo library."
LICENSE = "MIT"

PV = "7.2.0"

RPM_NAME = "libharfbuzz-cairo0-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "3660fdfe8e0ca9f62c518d255c4253cacb31c06d87a732ef2eb864d1d868b774fcc027c4c656715bc70a6d1e6b2bc30382cc140194cfe4dad635794d8cc550ba"

RPROVIDES:${PN} += "libharfbuzz-cairo.so.0()(64bit) libharfbuzz-cairo0 libharfbuzz-cairo0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
