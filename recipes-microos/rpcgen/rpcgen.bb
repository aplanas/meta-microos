SUMMARY = "RPC protocol compiler"
DESCRIPTION = "rpcgen is a tool that generates C code to implement an RPC protocol. \
The input to rpcgen is a language similar to C known as RPC Language \
(Remote Procedure Call Language)."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "rpcgen-1.4.3-1.4.aarch64.rpm"
RPM_HASH = "0aefc8d2d4b1c6b37ec1c974e6a3d1ec415e51080db3944b769b33411abf1bb7f80c03ee3d212e0c3a63b1e5cab7522fb3a4838e707bcea9d5d8e0b87a912b5e"

RPROVIDES:${PN} += "glibc-devel:/usr/bin/rpcgen rpcgen rpcgen(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
