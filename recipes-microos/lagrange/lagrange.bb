SUMMARY = "Desktop GUI client for browsing Geminispace"
DESCRIPTION = "Lagrange is a desktop GUI client for browsing Geminispace. It offers modern \
conveniences familiar from web browsers, such as smooth scrolling, inline image \
viewing, multiple tabs, visual themes, Unicode fonts, bookmarks, history, and \
page outlines."
LICENSE = "BSD-2-Clause"

PV = "1.15.9"

RPM_NAME = "lagrange-1.15.9-1.1.aarch64.rpm"
RPM_HASH = "fe45c0b6019e6bc908fdd5aab3ec70f4cad1a301d48bee93e1391a4da2ff483a2971d599f897461351f7428d097eda65c8377a9d14a269318574fb6cb11d32ae"

RPROVIDES:${PN} += "application() application(fi.skyjake.Lagrange.desktop) lagrange lagrange(aarch-64) metainfo() metainfo(fi.skyjake.Lagrange.appdata.xml) mimehandler(x-scheme-handler/gemini) mimehandler(x-scheme-handler/gopher) mimehandler(x-scheme-handler/spartan)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.14)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfribidi.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmpg123.so.0()(64bit) libpcre2-8.so.0()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libunistring.so.5()(64bit) libwebp.so.7()(64bit) libz.so.1()(64bit)"

inherit rpm
