SUMMARY = "X font handling library for server and utilities"
DESCRIPTION = "libXfont provides the core of the legacy X11 font system, handling \
the index files (fonts.dir, fonts.alias, fonts.scale), the various \
font file formats, and rasterizing them. It is used by the X servers, \
the X Font Server (xfs), and some font utilities (bdftopcf for \
instance), but should not be used by normal X11 clients. X11 clients \
access fonts via either the new APIs in libXft, or the legacy APIs in \
libX11."
LICENSE = "MIT"

PV = "2.0.6"

RPM_NAME = "libXfont2-2-2.0.6-1.4.aarch64.rpm"
RPM_HASH = "e1db77f2fd6ee06f88798ad5e96e595e01d16f587930427a86611c46a15a3f85d664ba1275aef1c3b9c185fd7c76fe94d8d1f48da598a023f5ad8379d1d9d7d4"

RPROVIDES:${PN} += "libXfont2-2 \
libXfont2-2(aarch-64) \
libXfont2.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libfontenc.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libz.so.1()(64bit)"

inherit rpm
