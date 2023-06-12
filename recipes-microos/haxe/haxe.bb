SUMMARY = "Multiplatform programming language"
DESCRIPTION = "Haxe is a high-level multiplatform programming language and compiler \
that can produce applications and source code for many different \
platforms from a single code-base. The Haxe compiler can compile Haxe \
source code to Adobe Flash SWF files, ActionScript 3, JavaScript, \
C++, PHP, C#, Java, Python, Lua, and Neko VM binary files."
LICENSE = "GPL-2.0+ & MIT"

PV = "4.3.1"

RPM_NAME = "haxe-4.3.1-2.1.aarch64.rpm"
RPM_HASH = "17d2b6625e06533191eeca06fe5c8831d0961e83721fddbe371ef67e268b2abba66cbdfbae3185c8e2a8aaf24216d39d56aef1ed0878c73f7fcd52bef88ba62d"

RPROVIDES:${PN} += "haxe haxe(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmbedcrypto.so.7()(64bit) libmbedtls.so.14()(64bit) libmbedx509.so.1()(64bit) libneko.so.2()(64bit) libpcre2-8.so.0()(64bit) libuv.so.1()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) neko"

inherit rpm
