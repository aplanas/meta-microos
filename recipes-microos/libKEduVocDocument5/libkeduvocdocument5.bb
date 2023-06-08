SUMMARY = "Library for KDE Education Applications"
DESCRIPTION = "This package contains the library which is required by the KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKEduVocDocument5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0152ecf9f884cef801b76775445a97d7ac2abdc424d09ac76e3cab2eebdba8d6cc57c4957483a838b998d924d60ca9484acf80b552f2d3fc71212e021bbaac71"

RPROVIDES:${PN} += "libKEduVocDocument.so.5()(64bit) libKEduVocDocument5 libKEduVocDocument5(aarch-64) libkeduvocdocument"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
