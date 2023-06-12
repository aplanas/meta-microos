SUMMARY = "Qt 6 LabsSettings library"
DESCRIPTION = "The Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsSettings6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "af9c237e7625a057fee8b3334c21f347ec429d0dbc47fdba26b914cf13e8acc608f14fdafdcde8b05a682d325936896bbd48c73e8413fbddb82d21510d6879a3"

RPROVIDES:${PN} += "libQt6LabsSettings.so.6()(64bit) \
libQt6LabsSettings.so.6(Qt_6)(64bit) \
libQt6LabsSettings.so.6(Qt_6.0)(64bit) \
libQt6LabsSettings.so.6(Qt_6.1)(64bit) \
libQt6LabsSettings.so.6(Qt_6.2)(64bit) \
libQt6LabsSettings.so.6(Qt_6.3)(64bit) \
libQt6LabsSettings.so.6(Qt_6.4)(64bit) \
libQt6LabsSettings.so.6(Qt_6.5)(64bit) \
libQt6LabsSettings.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6LabsSettings6 \
libQt6LabsSettings6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
