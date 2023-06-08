SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "lua51-mpack-1.0.6-5.2.aarch64.rpm"
RPM_HASH = "6eb1e3cabe55a4d5cbf07c77c9e3bb94cf8ad59d7bd2464de60e7088dd21c981b1a0537aad0c57119264197cbd984f033979fb08583aca38d5981ba8be953a46"

RPROVIDES:${PN} += "lua51-mpack lua51-mpack(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblua5.1.so.5()(64bit) lua51"

inherit rpm
