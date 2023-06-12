SUMMARY = "Multilingual text processing library for the C language"
DESCRIPTION = "A multilingual text processing library for the C language. \
This package contains shared libraries."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libm17n0-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "f962e9be06bd5042c43d093779e3ac5607d8aa23c5a22149355fa19ad6fc2ca38542fc83c6686c8a148e4482b7a876b4c807c6eedd1a155b6dd3471177f777e6"

RPROVIDES:${PN} += "libm17n-X.so()(64bit) \
libm17n-core.so.0()(64bit) \
libm17n-flt.so.0()(64bit) \
libm17n-gd.so()(64bit) \
libm17n-gui.so.0()(64bit) \
libm17n.so.0()(64bit) \
libm17n0 \
libm17n0(aarch-64) \
libmimx-anthy.so()(64bit) \
libmimx-ispell.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libgd.so.3()(64bit) \
libotf.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
pkgconfig(m17n-db)"

inherit rpm
