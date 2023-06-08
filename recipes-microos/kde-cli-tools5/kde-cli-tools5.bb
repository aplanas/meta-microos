SUMMARY = "Additional CLI tools for KDE applications"
DESCRIPTION = "Additional CLI tools for KDE applications and workspaces."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kde-cli-tools5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "91d6f5196e1c307b7c1dba953d8fc631368f15ee97d57e870a154bb6c25d44587f65379e588058318b50446d09b8a09d37659775ed16b748a09ed4fa4b4d359d"

RPROVIDES:${PN} += "application() application(kcm_filetypes.desktop) application(org.kde.keditfiletype.desktop) application(org.kde.plasma.settings.open.desktop) kde-cli-tools5 kde-cli-tools5(aarch-64) mimehandler(x-scheme-handler/systemsettings)"
RDEPENDS:${PN} += "/bin/sh kdbusaddons-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5Su.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libkworkspace5.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
