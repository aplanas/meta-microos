SUMMARY = "Library for KDE Education Applications"
DESCRIPTION = "This package contains the library which is required by the KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKEduVocDocument5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0f500e43419a0254be01086458d17c1364570825c7d3d7cde64a1be5b4e95a5dc47632998868defa2010073ed17d41db7d4f5beb1635a5122a03fb42d20462e1"

RPROVIDES:${PN} += "libKEduVocDocument.so.5()(64bit) \
libKEduVocDocument5 \
libKEduVocDocument5(aarch-64) \
libkeduvocdocument"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
