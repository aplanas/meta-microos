SUMMARY = "X font handling library for server and utilities"
DESCRIPTION = "libXfont provides the core of the legacy X11 font system, handling \
the index files (fonts.dir, fonts.alias, fonts.scale), the various \
font file formats, and rasterizing them. It is used by the X servers, \
the X Font Server (xfs), and some font utilities (bdftopcf for \
instance), but should not be used by normal X11 clients. X11 clients \
access fonts via either the new APIs in libXft, or the legacy APIs in \
libX11."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "libXfont1-1.5.4-2.24.aarch64.rpm"
RPM_HASH = "dc07a53d3acec463e14854309b7f0bc72689b10087ccd02755e2027a02de954c1adc16aaf969eb9590870d6cfba4fa59767dd175e7b1c759b44549fc6937e5c4"

RPROVIDES:${PN} += "libXfont.so.1()(64bit) libXfont1 libXfont1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libfontenc.so.1()(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libz.so.1()(64bit)"

inherit rpm
