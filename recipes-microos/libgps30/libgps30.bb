SUMMARY = "Shared library for GPS applications"
DESCRIPTION = "This package provides the shared library for gpsd and other GPS aware \
applications."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "libgps30-3.25-1.3.aarch64.rpm"
RPM_HASH = "ff74f52f8647865580bac43f245a281e62bd9643bdc4513a25a0592266adb462831122392e0a27cccf1a533c511e75759e2d793f3c43b7674a876dd35e05b0c3"

RPROVIDES:${PN} += "libgps.so.30()(64bit) libgps30 libgps30(aarch-64) libgpsdpacket.so.30()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbluetooth.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libgcc_s.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
