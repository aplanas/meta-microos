SUMMARY = "I/O library for IEEE 1394 asynchronous transactions"
DESCRIPTION = "I/O library for IEEE 1394 asynchronous transactions to/from units on the bus, \
with GObject Introspection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libhinawa2-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "1598776a96c564baff1b328090f3154a93196b3cb193ab4ceb1f4f266d3dc5b25efb89c06309a86c477c7388fa15ac0213857443d1f00f8e93e5a94fc13087db"

RPROVIDES:${PN} += "libhinawa.so.2()(64bit) libhinawa.so.2(HINAWA_0_6_0)(64bit) libhinawa.so.2(HINAWA_0_7_0)(64bit) libhinawa.so.2(HINAWA_0_8_0)(64bit) libhinawa.so.2(HINAWA_1_0_0)(64bit) libhinawa.so.2(HINAWA_1_1_0)(64bit) libhinawa.so.2(HINAWA_1_3_0)(64bit) libhinawa.so.2(HINAWA_1_4_0)(64bit) libhinawa.so.2(HINAWA_2_0_0)(64bit) libhinawa.so.2(HINAWA_2_1_0)(64bit) libhinawa.so.2(HINAWA_2_2_0)(64bit) libhinawa.so.2(HINAWA_2_3_0)(64bit) libhinawa.so.2(HINAWA_2_4_0)(64bit) libhinawa2 libhinawa2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
