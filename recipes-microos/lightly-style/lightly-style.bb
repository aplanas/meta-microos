SUMMARY = "Lightly kstyle theme and color schemes"
DESCRIPTION = "Lightly is a fork of breeze theme style that aims to be visually modern and minimalistic. \
 \
This package contains the kstyle theme and color schemes of Lightly."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "lightly-style-0.4.1-2.7.aarch64.rpm"
RPM_HASH = "844a28b70b4fee3086ec7b88d6ccd598fd2122d9a23ede9d9784300cf1dbd1488bb6891a50e0888defaf419b963e282b33c49ea52b127e844518410992a8b4ff"

RPROVIDES:${PN} += "cmake(Lightly) lightly-style lightly-style(aarch-64)"
RDEPENDS:${PN} += "kconf_update5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5Style.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblightlycommon5.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxcb.so.1()(64bit)"

inherit rpm
