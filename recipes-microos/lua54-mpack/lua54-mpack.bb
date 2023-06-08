SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "lua54-mpack-1.0.6-5.2.aarch64.rpm"
RPM_HASH = "3df3362c718cd99fae695c5a443c4bb4559b6a0e4df979b45b74e04dee61e5aa4ac506e8bfe781d87baddbe33379df0e48b4d5838de6ad066a0a5f15baa7fb0d"

RPROVIDES:${PN} += "lua-mpack lua54-mpack lua54-mpack(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblua5.4.so.5()(64bit) lua54"

inherit rpm
