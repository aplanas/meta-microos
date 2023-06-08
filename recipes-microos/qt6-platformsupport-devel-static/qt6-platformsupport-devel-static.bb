SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-platformsupport-devel-static-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "43f0ceea1b62e81d45dc73c08014f9b64016c86673220601c56f849d701633bf4a94589c5a2420d7b4f974df2e6c3f2a1475ee55522c1008435fc1e8afd4f93e"

RPROVIDES:${PN} += "cmake(Qt6DeviceDiscoverySupportPrivate) cmake(Qt6FbSupportPrivate) cmake(Qt6InputSupportPrivate) qt6-platformsupport-devel-static qt6-platformsupport-devel-static(aarch-64)"
RDEPENDS:${PN} += "pkgconfig(atspi-2) pkgconfig(egl) pkgconfig(fontconfig) pkgconfig(freetype2) pkgconfig(gl) pkgconfig(glib-2.0) pkgconfig(libinput) pkgconfig(libudev) pkgconfig(mtdev) pkgconfig(tslib) pkgconfig(x11) pkgconfig(xext) pkgconfig(xkbcommon) pkgconfig(xkbcommon-x11) pkgconfig(xrender) qt6-core-private-devel qt6-gui-private-devel"

inherit rpm
