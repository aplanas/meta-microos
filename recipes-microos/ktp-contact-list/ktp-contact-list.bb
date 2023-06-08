SUMMARY = "Telepathy contact list"
DESCRIPTION = "Telepathy contact list application"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-contact-list-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "4f455f4fc60b65b71b34a3c51a5be3924970839fba524af82ad5399dfbc4da9f7e422172f4fd3c81427f2e0513a2e7a9b84b621fc98d84723902cb4cc74806b1"

RPROVIDES:${PN} += "application() application(org.kde.ktpcontactlist.desktop) ktp-contact-list ktp-contact-list(aarch-64) ktp-contact-list5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5People.so.5()(64bit) libKF5PeopleWidgets.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKTpCommonInternals.so.9()(64bit) libKTpLogger.so.9()(64bit) libKTpModels.so.9()(64bit) libKTpWidgets.so.9()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-qt5.so.0()(64bit)"

inherit rpm
