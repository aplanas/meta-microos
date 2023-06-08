SUMMARY = "Network support for the Lua language"
DESCRIPTION = "LuaSocket is a Lua extension library that is composed by two parts: a C core \
that provides support for the TCP and UDP transport layers, and a set of Lua \
modules that add support for functionality commonly needed by applications \
that deal with the Internet. \
 \
Among the support modules, the most commonly used implement the SMTP, HTTP \
and FTP. In addition there are modules for MIME, URL handling and LTN12."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua53-luasocket-3.1.0-2.2.aarch64.rpm"
RPM_HASH = "9e643442d190e6b0862ede1633344b7bc89f490e912c774d9fa8c9fc1b2d5c4e75fa623871129e7f6e392e220cfdeb258bca475712d606e55d62de273f1cb0a0"

RPROVIDES:${PN} += "lua53-luasocket lua53-luasocket(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) lua53"

inherit rpm
