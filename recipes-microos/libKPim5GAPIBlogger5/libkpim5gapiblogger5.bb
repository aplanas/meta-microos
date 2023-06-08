SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5GAPIBlogger5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a990a0075a9dd9b271b5a5a2b1c56c802079e836fd64a3270fdebc5c6583a00f5663d6253105affbdd0886c94d6d8cb823403e931d7b19eca6bce5f655a90f27"

RPROVIDES:${PN} += "libKPim5GAPIBlogger.so.5()(64bit) libKPim5GAPIBlogger5 libKPim5GAPIBlogger5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPim5GAPICore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
