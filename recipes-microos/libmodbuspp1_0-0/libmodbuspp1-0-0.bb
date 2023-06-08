SUMMARY = "C++ wrapper for the libmodbus library"
DESCRIPTION = "A C++ wrapper for the libmodbus library, to send/receive data \
with a device which respects the Modbus protocol. This library \
can use a serial port or an Ethernet connection."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "libmodbuspp1_0-0-0.2.3-1.10.aarch64.rpm"
RPM_HASH = "f255b7b9f80bb2bc0781b32015057c4dcfb8b0423df5a60f48e5ffb37fc196728108eab85ff7c220b9d745e259054659bc75215bcfff563a32eb02787ed1bc5f"

RPROVIDES:${PN} += "libmodbuspp.so.1.0-0()(64bit) libmodbuspp1_0-0 libmodbuspp1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
