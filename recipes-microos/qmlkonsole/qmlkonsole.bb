SUMMARY = "Terminal application"
DESCRIPTION = "Terminal application offering additional keyboard buttons useful on touch \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "qmlkonsole-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "fcd6ad4235ca7b664a056cd1d1f4fe44d7d808393778545bf5281b6553749d075b3598542d7a9555cd7d7199ff733028a908bfff8faa2cc8eea9561410a348e9"

RPROVIDES:${PN} += "application() application(org.kde.qmlkonsole.desktop) metainfo() metainfo(org.kde.qmlkonsole.appdata.xml) qmlkonsole qmlkonsole(aarch-64)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qmltermwidget"

inherit rpm
