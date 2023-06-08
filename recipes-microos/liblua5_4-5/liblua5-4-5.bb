SUMMARY = "The Lua integration library"
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
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "liblua5_4-5-5.4.4-10.1.aarch64.rpm"
RPM_HASH = "d1b60eaa0b6dad23ad9fafff23179e70aff49a36e277867a1f2fcfff63aa1a47cf1256c6a26ecdb3bcc0a1af84568c1310f56d94673c29a7bda4a595537684fb"

RPROVIDES:${PN} += "liblua.so.5.4()(64bit) liblua5.4.so.5()(64bit) liblua5_4 liblua5_4-5 liblua5_4-5(aarch-64) lua54-libs"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
