SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications. \
This package contains the library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5Itinerary5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "c10903d5e12e8de70200138b573479f21f1f931973ba0368bacb4698b29a4123ddc3618051018a103cb33f39bd4044a75d283dffd8c03dec72244be961cf9f81"

RPROVIDES:${PN} += "libKPim5Itinerary.so.5()(64bit) libKPim5Itinerary5 libKPim5Itinerary5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5CalendarCore.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5I18nLocaleData.so.5()(64bit) libKPim5Mime.so.5()(64bit) libKPim5PkPass.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libZXing.so.3()(64bit) libc.so.6(GLIBC_2.32)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libphonenumber.so.8()(64bit) libpoppler.so.127()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) libxml2.so.2(LIBXML2_2.9.1)(64bit) libz.so.1()(64bit)"

inherit rpm
