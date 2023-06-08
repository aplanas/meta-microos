SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5PlatformSupport-devel-static-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "28df7cf741ff8d9d7bd424bfa3960354885e998725ea370e341ca8db825992213dca986d3765ba5b9671e800e2ecc351ee8b7fb8026c035acdf883391d47f3eb"

RPROVIDES:${PN} += "cmake(Qt5AccessibilitySupport) cmake(Qt5DeviceDiscoverySupport) cmake(Qt5EdidSupport) cmake(Qt5EglSupport) cmake(Qt5EventDispatcherSupport) cmake(Qt5FbSupport) cmake(Qt5FontDatabaseSupport) cmake(Qt5InputSupport) cmake(Qt5LinuxAccessibilitySupport) cmake(Qt5PlatformCompositorSupport) cmake(Qt5ServiceSupport) cmake(Qt5ThemeSupport) cmake(Qt5VulkanSupport) cmake(Qt5XkbCommonSupport) libQt5PlatformSupport-devel-static libQt5PlatformSupport-devel-static(aarch-64)"
RDEPENDS:${PN} += "libQt5Core-devel libQt5Gui-devel libQt5PlatformHeaders-devel pkgconfig(Qt5DBus) pkgconfig(egl) pkgconfig(fontconfig) pkgconfig(freetype2) pkgconfig(gl) pkgconfig(glib-2.0) pkgconfig(libinput) pkgconfig(libudev) pkgconfig(mtdev) pkgconfig(x11) pkgconfig(xext) pkgconfig(xkbcommon) pkgconfig(xkbcommon-x11) pkgconfig(xrender) tslib-devel"

inherit rpm
