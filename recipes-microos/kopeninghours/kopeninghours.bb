SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kopeninghours-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "cd8681c65a90204c58740bc87cd9e19b06d508a8fe1c67c25997f19e10f251a695a937ba22933a828eeeca27394bca857d0c25d2540cab00bb74471a5f765232"

RPROVIDES:${PN} += "kopeninghours kopeninghours(aarch-64) libkopeninghoursqmlplugin.so()(64bit) qt5qmlimport(org.kde.kopeninghours.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKOpeningHours.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
