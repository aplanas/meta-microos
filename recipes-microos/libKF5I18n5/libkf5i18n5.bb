SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5I18n5-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "c3267194884fb109f57372d009b3b96b25b2a3a1c9083287761bd63f593dbbf06728a2b79d50a0fad08a6e56aee3d186010d8f868578c6255d29bc3bf39d6d98"

RPROVIDES:${PN} += "libKF5I18n.so.5()(64bit) libKF5I18n5 libKF5I18n5(aarch-64) libKF5I18nLocaleData.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig iso-codes iso-codes-lang ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core5 libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
