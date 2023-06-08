SUMMARY = "stl-thumb Libraries"
DESCRIPTION = "stl-thumb Libraries"
LICENSE = "MIT"

PV = "0.5.0~0"

RPM_NAME = "libstl-thumb-0.5.0~0-1.5.aarch64.rpm"
RPM_HASH = "daf824eb4e051a7b5c95cd8c08e4fc96307b7ae267aa13688e6bbb1558e87e88364abbcaa6696f7e999381c87535b66bd3d26edc4b515a4013165bf6ca2b71b4"

RPROVIDES:${PN} += "libstl-thumb libstl-thumb(aarch-64) libstl_thumb.so()(64bit)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
