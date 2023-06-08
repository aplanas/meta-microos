SUMMARY = "Scheme implementation with teaching tools"
DESCRIPTION = "Racket (formerly called PLT Scheme) is a multi-paradigm programming language \
in the Lisp/Scheme family, that also serves as a platform for language \
creation, design, and implementation. \
 \
The programming language is known for its powerful macro system which enables \
the creation of embedded and domain-specific languages, language constructs \
such as classes or modules, and separate dialects of Racket enable different \
semantics."
LICENSE = "Apache-2.0 | MIT"

PV = "8.8"

RPM_NAME = "racket-8.8-1.3.aarch64.rpm"
RPM_HASH = "3c459282dbe930e02747cfbf78968e4cc7963d660794f6245a31e583e6ac437fed4aeec941d545bc2e4692a0635fe3ee9fbaa6a9e8a5c53897b1d11f19b5132c"

RPROVIDES:${PN} += "application() application(drracket.desktop) application(slideshow.desktop) config(racket) racket racket(aarch-64) racket-drracket racket-games racket-webserver"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo2 libedit0 libglib-2_0-0 libgtk-3-0 liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpango-1_0-0 libsqlite3-0 libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libz.so.1(ZLIB_1.2.0.2)(64bit) libz.so.1(ZLIB_1.2.2.3)(64bit)"

inherit rpm
