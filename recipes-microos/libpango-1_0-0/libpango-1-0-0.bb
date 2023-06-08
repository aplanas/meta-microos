SUMMARY = "Library for Layout and Rendering of Text"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.50.14"

RPM_NAME = "libpango-1_0-0-1.50.14-1.3.aarch64.rpm"
RPM_HASH = "0c60d79316103347eaab20035c6ab31c947dbc8596dca3fc922c00aa15a4edd27c62000d3abe7f7a090862e4d3b41e486b99847dd273ee1abffe4776415d2bbc"

RPROVIDES:${PN} += "libpango-1.0.so.0()(64bit) libpango-1_0-0 libpango-1_0-0(aarch-64) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) libpangoxft-1.0.so.0()(64bit) pango pango-modules"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXft.so.2()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libfribidi.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libthai.so.0()(64bit) libthai.so.0(LIBTHAI_0.1)(64bit) libthai.so.0(LIBTHAI_0.1.25)(64bit)"

inherit rpm
