SUMMARY = "Tool for creating shader effects for Qt Quick"
DESCRIPTION = "Qt Quick Effect Maker is a hybrid editor for creating shader effects for Qt \
Quick applications and offers both a node editor and a code editor."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffectmaker-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e3a11f99b83cd21eb52833eb9a9b78b2059de13cb4d4c435dd05a0488180e5bfe0d119629ff7b12bccb32ba87b622807921eeba4a5b8475d744a43c2a2da8244"

RPROVIDES:${PN} += "application() application(org.qt.quickeffectmaker6.desktop) qt6-quickeffectmaker qt6-quickeffectmaker(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Quick3DGlslParser.so.6()(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6ShaderTools.so.6()(64bit) libQt6ShaderTools.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
