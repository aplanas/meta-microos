SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "lua53-mpack-1.0.6-5.2.aarch64.rpm"
RPM_HASH = "14ba00a01ea850caef55dccb3f8b61452564104178ed2b24211262fde813d5d295d60e9ea91ff4b2dbd8e7c64efdeb54f409cd44a2de6a47a343c629aa09d866"

RPROVIDES:${PN} += "lua53-mpack lua53-mpack(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblua5.3.so.5()(64bit) lua53"

inherit rpm
