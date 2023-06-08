SUMMARY = "Libproxy module for NetworkManager configuration"
DESCRIPTION = "A module to extend libproxy with capabilities to query NetworkManager \
about network configuration changes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-networkmanager-0.4.18-1.6.aarch64.rpm"
RPM_HASH = "f24a604cf2405345c54c1c2a4131eb23b169879aacbe3d55362986ad8e8a6f19ba74c27043fbfdd67cbe2a19702e4674ad39c00ac809bcb34e83b2e823609fdf"

RPROVIDES:${PN} += "libproxy1-networkmanager libproxy1-networkmanager(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libproxy1 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
