SUMMARY = "Integration plugins for various KDE frameworks for wayland windowing system"
DESCRIPTION = "Provides integration plugins for various KDE frameworks for the wayland windowing system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.5"

RPM_NAME = "kwayland-integration-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "a6692720d650b63130207be5f1c0aad075cbef2c2e6b43008237c4596eb52eb2a2bec5f8688a72416249132a782e50707477c879e584973c1acadadff0f1ddf5"

RPROVIDES:${PN} += "kwayland-integration kwayland-integration(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5WaylandClient.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-client.so.0()(64bit)"

inherit rpm
