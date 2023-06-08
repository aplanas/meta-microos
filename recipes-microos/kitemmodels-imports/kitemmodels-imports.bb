SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. This package \
provides support to use KItemModels with the QtQuick framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kitemmodels-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "615aabe1f86ccd66a5666a63eda3af870d42587843241c94e63aa298ff732c2bb09b8ac915645dbcb28d6a730997eab6dacec952652b327bba52fde1d2955766"

RPROVIDES:${PN} += "kitemmodels-imports kitemmodels-imports(aarch-64) libitemmodelsplugin.so()(64bit) qt5qmlimport(org.kde.kitemmodels.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ItemModels.so.5()(64bit) libKF5ItemModels5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
