SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs or plugins with \
Qt Virtual Keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "b03fa0dbe60cdfd48a29c1d0755554f72dd36c75f902010e4bdc010307aeb93a61b38870dd987a7e362cc8121ae4b0b83c8130f24230e74e8d85eb04f2c63909"

RPROVIDES:${PN} += "cmake(Qt5VirtualKeyboard) libqt5-qtvirtualkeyboard-devel libqt5-qtvirtualkeyboard-devel(aarch-64) pkgconfig(Qt5VirtualKeyboard)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libqt5-qtvirtualkeyboard pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Qml) pkgconfig(Qt5Quick)"

inherit rpm
