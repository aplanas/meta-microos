SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract information \
from travel reservations. The model can then be reused in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kitinerary-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a7db43864ba0159665252c460d881b679f261acf3d8cfae2af3f7043c4f236033f10d7e3269cc574f0f0f4f3b4d5f13f1df4e05ec80f7b229c4d0e36189c6f1e"

RPROVIDES:${PN} += "kitinerary kitinerary(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKPim5Itinerary.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
