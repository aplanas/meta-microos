SUMMARY = "Tools for Manipulating PNG Images"
DESCRIPTION = "Package consists of low level tools for manipulating and fixing particular \
PNG files."
LICENSE = "libpng-2.0"

PV = "1.6.39"

RPM_NAME = "libpng16-tools-1.6.39-3.1.aarch64.rpm"
RPM_HASH = "d4ab6be759e72975aff19b55fa4c87df65a75b32a47fe18e1d7352dc61c85025450868dddf8c9b0245bb4288905c4ecb50f5a806b66e059f045a813464ea8d17"

RPROVIDES:${PN} += "libpng-tools libpng16-tools libpng16-tools(aarch-64) rpm_macro(png_fix) rpm_macro(png_fix_dir)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.4)(64bit)"

inherit rpm
