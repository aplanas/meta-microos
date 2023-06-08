SUMMARY = "Monitor inotify limits and inform the user when they are reached"
DESCRIPTION = "Tooling for monitoring inotify limits and informing the user \
when they have been or are about to be reached."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kde-inotify-survey-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2666e6fa1aa53376a169ea2cecac1a1a32858831de00d96831bab45dcbadecac423a17a286686861b79a1e10d1dd43b5d889143f5c8b0253ed50bdd975b8f3bc"

RPROVIDES:${PN} += "kde-inotify-survey kde-inotify-survey(aarch-64) metainfo() metainfo(org.kde.inotify-survey.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5AuthCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit)"

inherit rpm
