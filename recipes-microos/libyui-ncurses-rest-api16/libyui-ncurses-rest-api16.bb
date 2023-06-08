SUMMARY = "Libyui - REST API plugin for the Ncurses frontend"
DESCRIPTION = "This package provides a libyui REST API plugin for the \
Ncurses frontend. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API. This is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-ncurses-rest-api16-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "14c8e81606fd291a9289f3a96591d385f7c668f6313506d17ee50a009e9096b8214c6a0fc88882cd0c41415f4272790cb52eaf52b4a07eca2caee537350b7025"

RPROVIDES:${PN} += "libyui-ncurses-rest-api libyui-ncurses-rest-api.so.16()(64bit) libyui-ncurses-rest-api16 libyui-ncurses-rest-api16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libyui-ncurses16 libyui-rest-api16 libyui.so.16()(64bit) libyui16 yui_backend"

inherit rpm
