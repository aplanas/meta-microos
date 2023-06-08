SUMMARY = "Stl-thumb is a fast lightweight thumbnail generator for STL files."
DESCRIPTION = "Stl-thumb is a fast lightweight thumbnail generator for STL files. \
It can show previews for STL files in your file manager on Linux and Windows. \
It is written in Rust and uses OpenGL."
LICENSE = "MIT"

PV = "0.5.0~0"

RPM_NAME = "stl-thumb-0.5.0~0-1.5.aarch64.rpm"
RPM_HASH = "b8295c4937bfb1208a5ddde313ccb4eb7eb0bfefab2b0c9236378062d39fac032b3d2fcfc90e21960e7d3d9925b7ef8b01f05280b928535179050036cd390462"

RPROVIDES:${PN} += "stl-thumb stl-thumb(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
