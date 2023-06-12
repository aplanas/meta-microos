SUMMARY = "GrantleeTheme library for KDE PIM applications"
DESCRIPTION = "The GrantleeTheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GrantleeTheme5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2f52f008fab3062c08939946e80e58a3f8f32cdc354f8f39819319a152f95895ee7012394218e71ef97d71e3aba35c55e34cdbe808b5d4e3bcf37bfcedd6cd55"

RPROVIDES:${PN} += "libKPim5GrantleeTheme.so.5()(64bit) \
libKPim5GrantleeTheme5 \
libKPim5GrantleeTheme5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
