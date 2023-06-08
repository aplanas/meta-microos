SUMMARY = "SCXML (state machine notation) compiler and related tools"
DESCRIPTION = "The Qt SCXML module provides functionality to create state machines from SCXML \
files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-scxml-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4b8d4dced7a3df42d9634998c37554780ee1575afe2c25924e20b642bcf6d6f49079ef55f438836e693c7446d96f081bdbf1bf1fb50ae4255b1c8661539ee55c"

RPROVIDES:${PN} += "libqscxmlecmascriptdatamodel.so()(64bit) libqscxmlecmascriptdatamodel.so(Qt_6)(64bit) libqscxmlecmascriptdatamodel.so(Qt_6.0)(64bit) libqscxmlecmascriptdatamodel.so(Qt_6.1)(64bit) libqscxmlecmascriptdatamodel.so(Qt_6.2)(64bit) libqscxmlecmascriptdatamodel.so(Qt_6.3)(64bit) libqscxmlecmascriptdatamodel.so(Qt_6.4)(64bit) libqscxmlecmascriptdatamodel.so(Qt_6.5)(64bit) libqscxmlecmascriptdatamodel.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-scxml qt6-scxml(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Scxml.so.6()(64bit) libQt6Scxml.so.6(Qt_6)(64bit) libQt6Scxml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
