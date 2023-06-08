SUMMARY = "Tools from the HarfBuzz text shaping software"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides a set of tools for HarfBuzz."
LICENSE = "MIT"

PV = "7.2.0"

RPM_NAME = "harfbuzz-tools-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "f1427d51e63f7b1e90d64d4a18453804c51a1911ac3405ad47fe0c61b78312fbc65f5f44283259875f4201d4b47204ceedfbe2b4b1b0191452b33e0ff8616149"

RPROVIDES:${PN} += "harfbuzz-tools harfbuzz-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreetype.so.6()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libharfbuzz-cairo.so.0()(64bit) libharfbuzz-gobject.so.0()(64bit) libharfbuzz-subset.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
