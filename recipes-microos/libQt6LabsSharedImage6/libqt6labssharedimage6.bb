SUMMARY = "Qt 6 LabsSharedImage library"
DESCRIPTION = "The Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6LabsSharedImage6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "4524403a9ed19dc9e9fc73a28b8e2bae6c6952945b3ba6783b4e690055441f1b1000c3ad2df8c63c4f28259bcfcdff7be30a909d887bb3981237d3a15a41e371"

RPROVIDES:${PN} += "libQt6LabsSharedImage.so.6()(64bit) libQt6LabsSharedImage.so.6(Qt_6)(64bit) libQt6LabsSharedImage.so.6(Qt_6.0)(64bit) libQt6LabsSharedImage.so.6(Qt_6.1)(64bit) libQt6LabsSharedImage.so.6(Qt_6.2)(64bit) libQt6LabsSharedImage.so.6(Qt_6.3)(64bit) libQt6LabsSharedImage.so.6(Qt_6.4)(64bit) libQt6LabsSharedImage.so.6(Qt_6.5)(64bit) libQt6LabsSharedImage.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6LabsSharedImage6 libQt6LabsSharedImage6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
