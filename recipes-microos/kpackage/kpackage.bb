SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kpackage-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "e4b5f3054b70e6528f0ff02b48793b256983dd09c02606234f9331693e7dfe7af18ad64645830b1c03e89aaabf898c1fdf0fd959c54044149dd6f58ba05dbbe3"

RPROVIDES:${PN} += "kpackage kpackage(aarch-64) libKF5Package.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
