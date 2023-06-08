SUMMARY = "Multi-protocol extensible Chat Client"
DESCRIPTION = "WeeChat (Wee Enhanced Environment for Chat) is a free chat client, fast and light, designed for many operating systems. It is highly customizable and extensible with scripts. \
 \
Homepage: https://weechat.org/"
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-3.8-1.1.aarch64.rpm"
RPM_HASH = "943c0b5276e08b00f28755118c95cda7a974bd7fa94202f257ded5271f59dccec4ca1bb5973f9f366fbbe93543850cc5ec946403678b337c574c9af6a564c579"

RPROVIDES:${PN} += "application() application(weechat.desktop) mimehandler(x-scheme-handler/irc) mimehandler(x-scheme-handler/ircs) weechat weechat(aarch-64)"
RDEPENDS:${PN} += "ca-certificates hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzstd.so.1()(64bit)"

inherit rpm
