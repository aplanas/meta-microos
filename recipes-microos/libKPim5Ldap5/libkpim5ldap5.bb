SUMMARY = "KDE PIM Libraries: LDAP support"
DESCRIPTION = "This package provides LDAP support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5Ldap5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e4a1bb2e43c2062b25aed4aeb919d6c554bd68f2c234b85a3ccc1202a25ae67c94465b1f111f4ea6bf6d1c0f0d0245a95045b6bc39683040af12c62a64144185"

RPROVIDES:${PN} += "libKPim5Ldap.so.5()(64bit) libKPim5Ldap5 libKPim5Ldap5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kldap ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libqt5keychain.so.1()(64bit) libsasl2.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
