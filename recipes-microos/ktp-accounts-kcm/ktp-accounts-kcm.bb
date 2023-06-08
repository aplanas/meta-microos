SUMMARY = "Configuration module to set up Telepathy accounts"
DESCRIPTION = "This is a KControl Module which handles adding/editing/removing Telepathy \
Accounts. It interacts with any Telepathy Spec compliant AccountManager, \
such as telepathy-accountmanager-kwallet to manipulate the accounts. It is \
modular in design, with each ConnectionManager-Protocol combination having a \
plugin that provides customised forms for adding or editing their accounts, \
and also with a generic plugin which can be used as a fallback for \
ConnectionManager-Protocol combinations where no plugin exists."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-accounts-kcm-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "717b3385fda7ad72984d8234426c7dd66c9c4fbc30c3165641877813b224ffb43aad4c102e31ecead1d016b609d67aa84b0f275af7753fa80ec3220d6d701508"

RPROVIDES:${PN} += "ktp-accounts-kcm ktp-accounts-kcm(aarch-64) ktp-accounts-kcm5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libaccounts-qt5.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libkaccounts.so.2()(64bit) libktpaccountskcminternal.so.9()(64bit) libsignon-qt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-qt5.so.0()(64bit) telepathy-mission-control"

inherit rpm
