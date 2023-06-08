SUMMARY = "Qt 6 OpcUa QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 OpcUa module."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-opcua-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a89051cff3845549c50f12c1c8861d8e97ff1dda1dc62c749b71645fb3e88348c5fdbb6ef4090dd18e627a1042b9ee33df03b0bf9fa8fa5dafe06370d7421338"

RPROVIDES:${PN} += "libdeclarativeopcuaplugin.so()(64bit) libdeclarativeopcuaplugin.so(Qt_6)(64bit) libdeclarativeopcuaplugin.so(Qt_6.0)(64bit) libdeclarativeopcuaplugin.so(Qt_6.1)(64bit) libdeclarativeopcuaplugin.so(Qt_6.2)(64bit) libdeclarativeopcuaplugin.so(Qt_6.3)(64bit) libdeclarativeopcuaplugin.so(Qt_6.4)(64bit) libdeclarativeopcuaplugin.so(Qt_6.5)(64bit) libdeclarativeopcuaplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-opcua-imports qt6-opcua-imports(aarch-64)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DeclarativeOpcua.so.6()(64bit) libQt6DeclarativeOpcua.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt6-opcua"

inherit rpm
