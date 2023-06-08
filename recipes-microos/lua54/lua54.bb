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

PV = "5.4.4"

RPM_NAME = "lua54-5.4.4-10.1.aarch64.rpm"
RPM_HASH = "4a223c5817f8d7d43ca38445025c8853ec51da0088454901e3e7d92ae372b3d63ec4cf72ef91cbb0e809d24de73a8e32a32ba62cfdf88aaf9aa8957c64bd90f6"

RPROVIDES:${PN} += "Lua(API) lua lua54 lua54(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblua5.4.so.5()(64bit) libreadline.so.8()(64bit) update-alternatives"

inherit rpm
