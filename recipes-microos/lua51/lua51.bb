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
LICENSE = "MIT"

PV = "5.1.5"

RPM_NAME = "lua51-5.1.5-15.16.aarch64.rpm"
RPM_HASH = "2f8cee1307dc3e35e6f938a0b24923bbd613d41068ed8d3c807d0795b8f5e360930ab93965715a906984281eced142b50582f0c38675f8dafc425175d441a73e"

RPROVIDES:${PN} += "Lua(API) \
lua \
lua51 \
lua51(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libreadline.so.8()(64bit) \
update-alternatives"

inherit rpm
