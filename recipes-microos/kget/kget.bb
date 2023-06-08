SUMMARY = "Download Manager"
DESCRIPTION = "An advanced download manager by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kget-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3fbb018c91a7186432b87e179832194f23724fa8ba5a1ffb26b72fe5b68e49712b6632b21f618ca4faccb2a6ccb8a468cb82cb0b04e3e5a2dd0ab26a6505abaa"

RPROVIDES:${PN} += "application() application(org.kde.kget.desktop) kget kget(aarch-64) kget5 libkgetcore.so.5()(64bit) metainfo() metainfo(org.kde.kget.appdata.xml) mimehandler(application/metalink+xml) mimehandler(application/x-bittorrent)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5I18nLocaleData.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Torrent.so.6()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgpgmepp.so.6()(64bit) libkworkspace5.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libqca-qt5.so.2()(64bit) libqgpgme.so.15()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
