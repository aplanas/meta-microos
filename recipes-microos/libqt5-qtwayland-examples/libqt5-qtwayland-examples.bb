SUMMARY = "Qt5 wayland examples"
DESCRIPTION = "Examples for libqt5-qtwayland module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde55"

RPM_NAME = "libqt5-qtwayland-examples-5.15.9+kde55-1.1.aarch64.rpm"
RPM_HASH = "568aa9ce7576f8e33215fb5c4ac83415e8d8225bd1f2edf4d2e58f75bd745b208bdcb23f4e11cd8c84c44d3dda22d95547fe78c57a3a6ee2ff97aa67e0ff5b5c"

RPROVIDES:${PN} += "libqt5-qtwayland-examples \
libqt5-qtwayland-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5)(64bit) \
libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WaylandCompositor.so.5()(64bit) \
libQt5WaylandCompositor.so.5(Qt_5)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.VirtualKeyboard.2) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(QtWayland.Client.TextureSharing.1) \
qt5qmlimport(QtWayland.Compositor.1)"

inherit rpm
