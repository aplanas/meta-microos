SUMMARY = "Infiniband Unified Communication Protocols"
DESCRIPTION = "High-level API uses UCT framework to construct protocols commonly \
found in applications (MPI, OpenSHMEM, PGAS, etc.)"
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucp0-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "4849676df353313ff3163705611e537af28b695277ea9f4c53fbfb329c87dae99a81d042eee6f2e0362c1164a38debf8b7d0d432bfb3cc79df843a66c10ee90b"

RPROVIDES:${PN} += "libucp.so.0()(64bit) \
libucp0 \
libucp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libucs.so.0()(64bit) \
libuct.so.0()(64bit)"

inherit rpm
