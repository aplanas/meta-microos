SUMMARY = "Libproxy module for GNOME3 configuration"
DESCRIPTION = " \
A module to extend libproxy with capabilities to query GNOME about \
proxy settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-gnome3-0.4.18-1.6.aarch64.rpm"
RPM_HASH = "88addfb4c2f477c8fc4db5d8b365ecb436ab6b01e2eade7b61e656090d71aea70e876a4dc3d885eb24c08656e153510961284c6826a4fdf73e0d83d6b03da23e"

RPROVIDES:${PN} += "libproxy-gnome libproxy1-config-gnome3 libproxy1-config-gnome3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libproxy.so.1()(64bit) libproxy1 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
