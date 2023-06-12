SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde55"

RPM_NAME = "libqt5-qtwayland-5.15.9+kde55-1.1.aarch64.rpm"
RPM_HASH = "52e13beb8cf9e633f5ac597a15dfce70e0cdd7b699c4a028eac8b676fb188da561f25802e76fc0e87b086cf28c45ac4be9148a4ab7e69e095ccdef47cf371113"

RPROVIDES:${PN} += "libbradient.so()(64bit) \
libdmabuf-server.so()(64bit) \
libdrm-egl-server.so()(64bit) \
libfullscreen-shell-v1.so()(64bit) \
libivi-shell.so()(64bit) \
libqt-plugin-wayland-egl.so()(64bit) \
libqt-wayland-compositor-dmabuf-server-buffer.so()(64bit) \
libqt-wayland-compositor-drm-egl-server-buffer.so()(64bit) \
libqt-wayland-compositor-linux-dmabuf-unstable-v1.so()(64bit) \
libqt-wayland-compositor-shm-emulation-server.so()(64bit) \
libqt-wayland-compositor-vulkan-server.so()(64bit) \
libqt-wayland-compositor-wayland-egl.so()(64bit) \
libqt-wayland-compositor-wayland-eglstream-controller.so()(64bit) \
libqt-wayland-compositor-xcomposite-egl.so()(64bit) \
libqt5-qtwayland \
libqt5-qtwayland(aarch-64) \
libqwayland-egl.so()(64bit) \
libqwayland-generic.so()(64bit) \
libqwayland-xcomposite-egl.so()(64bit) \
libqwaylandcompositorplugin.so()(64bit) \
libqwaylandtexturesharing.so()(64bit) \
libqwaylandtexturesharingextension.so()(64bit) \
libshm-emulation-server.so()(64bit) \
libvulkan-server.so()(64bit) \
libwl-shell.so()(64bit) \
libxcomposite-egl.so()(64bit) \
libxdg-shell-v5.so()(64bit) \
libxdg-shell-v6.so()(64bit) \
libxdg-shell.so()(64bit) \
qt5qmlimport(QtWayland.Client.TextureSharing.1) \
qt5qmlimport(QtWayland.Compositor.1) \
qt5qmlimport(QtWayland.Compositor.TextureSharingExtension.1)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5)(64bit) \
libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WaylandCompositor.so.5()(64bit) \
libQt5WaylandCompositor.so.5(Qt_5)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libwayland-server.so.0()(64bit)"

inherit rpm
