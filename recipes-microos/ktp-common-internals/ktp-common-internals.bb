SUMMARY = "Telepathy common module"
DESCRIPTION = "ktp-common-internals is the base library for all the KDE Telepathy packages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-common-internals-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "1bcfba837be11167300028ff1960a51a0d7481a1c70b30b2b69fdcd794578fb5d4be5a284b61649f6f69320297a036ce111d74c9e9247d2008a53f2432cc2bad"

RPROVIDES:${PN} += "ktp-common-internals ktp-common-internals(aarch-64) ktp-common-internals5 libKTpCommonInternals.so.9()(64bit) libKTpLogger.so.9()(64bit) libKTpModels.so.9()(64bit) libKTpOTR.so.9()(64bit) libKTpWidgets.so.9()(64bit) libktpcommoninternals6 libktpcommoninternals7 libktpcommoninternals8 libktpqmlplugin.so()(64bit) qt5qmlimport(org.kde.telepathy.0)"
RDEPENDS:${PN} += "/sbin/ldconfig ktp-icons ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5People.so.5()(64bit) libKF5PeopleBackend.so.5()(64bit) libKF5PeopleWidgets.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5TextEditor.so.5()(64bit) libKF5Wallet.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libaccounts-qt5.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libkaccounts.so.2()(64bit) libotr.so.5()(64bit) libsignon-qt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-logger-qt.so.5()(64bit) libtelepathy-qt5-service.so.1()(64bit) libtelepathy-qt5.so.0()(64bit) telepathy-accounts-signon"

inherit rpm
