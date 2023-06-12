SUMMARY = "C++ Interface for D-Bus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-glib-1-1-0.9.1+git20170322-4.5.aarch64.rpm"
RPM_HASH = "4ce2b54dc914d352eacdcdd4cd3756882397939f8e2c42b4fbc3b6a5c7118850df170c028f9ba63488998cb7625b003ea1a7925797b105537eb8210472f0f595"

RPROVIDES:${PN} += "libdbus-c++-glib-1-1 \
libdbus-c++-glib-1-1(aarch-64) \
libdbus-c++-glib-1.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
