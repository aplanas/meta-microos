SUMMARY = "SVG Convert using the GNOME Render SVG library"
DESCRIPTION = "This package contains a tool to convert SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.0"

RPM_NAME = "rsvg-convert-2.56.0-3.1.aarch64.rpm"
RPM_HASH = "ebc420c501f2fe1102941b22c81db5bc4f9fe9aa62f7f7fc6ea34974a702d8fc596c6a2b0b3cabde450338310293a82ce3e45325a3efacf4da040a9f929e2076"

RPROVIDES:${PN} += "rsvg-convert rsvg-convert(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.0)(64bit)"

inherit rpm
