SUMMARY = "Libyui - REST API plugin, the shared part"
DESCRIPTION = "This package provides a libyui REST API plugin. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API, it is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-rest-api16-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "95579023c44666f9f81fb87da99e74fee9d11cff0d5cdada284baafc9517437ac3c5f51b2124ba699b0e3bf62b315e4b8b422a45848121475221ebcba0c731be"

RPROVIDES:${PN} += "libyui-rest-api libyui-rest-api.so.16()(64bit) libyui-rest-api16 libyui-rest-api16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjsoncpp.so.25()(64bit) libmicrohttpd.so.12()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libyui.so.16()(64bit) libyui16 yui_backend"

inherit rpm
