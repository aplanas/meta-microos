SUMMARY = "Libyui - The REST API plugin for the Qt frontend"
DESCRIPTION = "This package provides a libyui REST API plugin for the Qt frontend. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API. This is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-qt-rest-api16-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "8f4ad2abc564092176f86c3f8d53800a3d65651612e729994750c474d2b93b290e22a9b287b9d4ac61350cb0b07ba2cbedc35f2a8901f0e90d2e9e62a5f29a0f"

RPROVIDES:${PN} += "libyui-qt-rest-api libyui-qt-rest-api.so.16()(64bit) libyui-qt-rest-api16 libyui-qt-rest-api16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libyui-qt16 libyui-rest-api16 libyui.so.16()(64bit) libyui16 yui_backend"

inherit rpm
