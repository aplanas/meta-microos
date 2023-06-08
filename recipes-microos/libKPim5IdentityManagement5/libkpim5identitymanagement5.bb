SUMMARY = "KDE PIM Libraries: Identity Management - core library"
DESCRIPTION = "This package provides the core library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5IdentityManagement5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "53616d7decd35c7a9b752c4716c1ce1d16a1689c62175ccd03453b75271508be4e2a2059b56d85e2a6dd3bbd9de79bc55fa30ccc8857de9269a6f2318cb81f84"

RPROVIDES:${PN} += "libKPim5IdentityManagement.so.5()(64bit) libKPim5IdentityManagement5 libKPim5IdentityManagement5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
