SUMMARY = "PDF and XPS Viewer and Parser and Rendering Library"
DESCRIPTION = "MuPDF is a PDF and XPS viewer and parser/rendering library. \
 \
The renderer in MuPDF is tailored for anti-aliased graphics. It \
renders text with metrics and spacing accurate to within fractions of \
a pixel for reproducing the look of a printed page on screen. \
 \
MuPDF supports PDF 1.7 with transparency, encryption, hyperlinks, \
annotations and search. MuPDF can also read XPS documents \
(OpenXPS/ECMA-388)."
LICENSE = "AGPL-3.0-or-later"

PV = "1.21.1"

RPM_NAME = "mupdf-1.21.1-3.3.aarch64.rpm"
RPM_HASH = "271e108699075f2cb7913d1baffd569b587488b2d4293c4744cac7182a22262cbdf7bfc28468065dcd3755aee8da284aca938dc1f6f599b939eda95941ab50dd"

RPROVIDES:${PN} += "application() application(mupdf-gl.desktop) application(mupdf.desktop) bundled(freeglut) bundled(freeglut-art) bundled(gumbo-parser) bundled(lcms2) bundled(lcms2-art) bundled(mujs) mimehandler(application/pdf) mimehandler(application/x-pdf) mupdf mupdf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libfreetype.so.6()(64bit) libharfbuzz.so.0()(64bit) libjbig2dec.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libopenjp2.so.7()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) xdg-utils"

inherit rpm
