SUMMARY = "Qt 6 RemoteObjects QML files"
DESCRIPTION = "QML files and plugins for the Qt 6 RemoteObjects module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjects-imports-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d1eaabb7e27b119fcb0790fd9415d4c61f0f198027930af6cacefeda7a53c95222484b5216213eba480562533230e1f4ae504ee14b2344581483d1aa4628b14b"

RPROVIDES:${PN} += "libdeclarative_remoteobjectsplugin.so()(64bit) libdeclarative_remoteobjectsplugin.so(Qt_6)(64bit) libdeclarative_remoteobjectsplugin.so(Qt_6.0)(64bit) libdeclarative_remoteobjectsplugin.so(Qt_6.1)(64bit) libdeclarative_remoteobjectsplugin.so(Qt_6.2)(64bit) libdeclarative_remoteobjectsplugin.so(Qt_6.3)(64bit) libdeclarative_remoteobjectsplugin.so(Qt_6.4)(64bit) libdeclarative_remoteobjectsplugin.so(Qt_6.5)(64bit) libdeclarative_remoteobjectsplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-remoteobjects-imports qt6-remoteobjects-imports(aarch-64)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6RemoteObjectsQml.so.6()(64bit) libQt6RemoteObjectsQml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
