SUMMARY = "A library for sharing Bible navigation"
DESCRIPTION = "BibleSync is a multicast protocol to support Bible software shared \
co- navigation. It uses LAN multicast in either a personal/small team \
mutual navigation motif or in a classroom environment where there are \
Speakers plus the Audience. It provides a complete yet minimal public \
interface to support mode setting, setup for packet reception, \
transmit on local navigation, and handling of incoming packets. \
 \
This library is not specific to any particular Bible software \
framework, completely agnostic as to structure of layers above \
BibleSync."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libbiblesync2_0-2.1.0-1.9.aarch64.rpm"
RPM_HASH = "21a6942d7ea2312f682bbccfd9bc79a69eee5cb48ebefa0ba3550450cec468c08a7019ecf483b99792c84854b82940fdd7505468cf21bf339881d9ffaebcbe3f"

RPROVIDES:${PN} += "libbiblesync.so.2.0()(64bit) libbiblesync2_0 libbiblesync2_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
