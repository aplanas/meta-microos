SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua53-linenoise-0.9-2.4.aarch64.rpm"
RPM_HASH = "bc8f29dd5948606256f2046c6761bf1a9146e6dc67b10df0c95378142505a1d0617c1091da6ef5b11dd4ea330aa17a611f95bc132edf7bc2d9d187110295d06e"

RPROVIDES:${PN} += "lua53-linenoise \
lua53-linenoise(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
lua53"

inherit rpm
