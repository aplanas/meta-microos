SUMMARY = "KDE Wayland library: Build Environment"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kwayland-devel-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "863c1eaeea5d23097e67d0d57ea66deecf6719df10ef75349fa741800cdc958481be98ebc1a70cd5999357a7c698d5d6187b221310f58c08e1f724e378f8cae5"

RPROVIDES:${PN} += "cmake(KF5Wayland) kwayland-devel kwayland-devel(aarch-64) pkgconfig(KF5WaylandClient)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt5Gui) extra-cmake-modules kwayland ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5WaylandServer.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) pkgconfig(Qt5Gui)"

inherit rpm
