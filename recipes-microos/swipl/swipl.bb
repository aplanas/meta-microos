SUMMARY = "Prolog Compiler"
DESCRIPTION = "Edinburgh-style Prolog compiler including modules, autoload, libraries, \
Garbage collector, stack expandor, C interface, GNU readline and GNU \
Emacs interface, a very fast compiler,and an X11 interface using XPCE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9.0.4"

RPM_NAME = "swipl-9.0.4-1.3.aarch64.rpm"
RPM_HASH = "f0074d3d7d5961426f76d40240768777bb068318ca2c37ebe29ffad60d4a69bd6fd9acee835c799bd7b79226dfb9a8c5df2873cd9cb43f3b5bb41c7429a737b3"

RPROVIDES:${PN} += "cmake(SWIPL) libedit4pl.so()(64bit) libjpl.so()(64bit) libswipl.so.9()(64bit) pkgconfig(swipl) swi-prolog swi_pl swipl swipl(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXft.so.2()(64bit) libXpm.so.4()(64bit) libXt.so.6()(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdb-4.8.so()(64bit) libedit.so.0()(64bit) libfontconfig.so.1()(64bit) libgmp.so.10()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libjvm.so()(64bit) libjvm.so(SUNWprivate_1.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libodbc.so.2()(64bit) libossp-uuid.so.16()(64bit) libreadline.so.8()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libyaml-0.so.2()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.2)(64bit)"

inherit rpm
