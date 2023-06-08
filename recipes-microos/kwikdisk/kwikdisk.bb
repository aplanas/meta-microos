SUMMARY = "Removable Media Utility"
DESCRIPTION = "This utility allows you to manage removable media."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kwikdisk-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e8d710310bc07eb24452e36d0be68b3a8d6c503aa3af5a61b60d3c083302817ffb43419e469f34144955b7c4268c2b9611cb28f3b94ba33b56a2d2288421ce14"

RPROVIDES:${PN} += "application() application(org.kde.kwikdisk.desktop) kwikdisk kwikdisk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkdfprivate.so.23()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
