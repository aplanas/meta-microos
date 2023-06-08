SUMMARY = "Encryption Tool"
DESCRIPTION = "Kgpg is a simple GUI for gpg"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kgpg-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7aff974f62c592113cf20ada6deaa5a6e2c84c2e353e71443a2a142d2377df0babc7306e80c1c2b50913d41ad775a2ca938ba198c7db48c5b146b4d2a4bfc6f0"

RPROVIDES:${PN} += "application() application(org.kde.kgpg.desktop) config(kgpg) kgpg kgpg(aarch-64) metainfo() metainfo(org.kde.kgpg.appdata.xml) mimehandler(application/pgp-encrypted) mimehandler(application/pgp-keys) mimehandler(application/pgp-signature)"
RDEPENDS:${PN} += "gpg2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiContact.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit)"

inherit rpm
