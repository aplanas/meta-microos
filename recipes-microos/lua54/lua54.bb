SUMMARY = "Small Embeddable Language with Procedural Syntax"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
Lua combines procedural syntax (similar to Pascal) with \
data description constructs based on associative arrays and extensible \
semantics. Lua is dynamically typed, interpreted from byte codes, and \
has automatic memory management, making it suitable for configuration, \
scripting, and rapid prototyping. Lua is implemented as a small library \
of C functions, written in ANSI C."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.6"

RPM_NAME = "lua54-5.4.6-1.1.aarch64.rpm"
RPM_HASH = "8fea06dbf0de61ad7a9749e7f85764f453250a6e6a0bea6613ccfda9055c64a0848603a97ab6a3cd4341c0d071911f0c9a37ef667986728f460edfc027ab03f6"

RPROVIDES:${PN} += "Lua(API) lua lua54 lua54(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblua5.4.so.5()(64bit) libreadline.so.8()(64bit) update-alternatives"

inherit rpm
