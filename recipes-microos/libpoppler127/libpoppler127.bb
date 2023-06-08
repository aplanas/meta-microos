SUMMARY = "PDF Rendering Library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libpoppler127-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a2957cbe8c0e5dcb0d264139213bb7f3c639d88cb216611c9e46bf1d0b1d3976d15665b21d2ba4d6f56c9c07338f0a496d37934fc7fb950d86b7b9ba78e6db4f"

RPROVIDES:${PN} += "libpoppler.so.127()(64bit) libpoppler127 libpoppler127(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcurl.so.4()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.12)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.4)(64bit) libnss3.so(NSS_3.8)(64bit) libnss3.so(NSS_3.9.2)(64bit) libnss3.so(NSS_3.9.3)(64bit) libopenjp2.so.7()(64bit) libplc4.so()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.16)(64bit) libsmime3.so(NSS_3.2)(64bit) libsmime3.so(NSS_3.4)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libz.so.1()(64bit)"

inherit rpm
