SUMMARY = "Tool for creating shader effects for Qt Quick"
DESCRIPTION = "Qt Quick Effect Maker is a hybrid editor for creating shader effects for Qt \
Quick applications and offers both a node editor and a code editor."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-quickeffectmaker-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7fddf794570a74f931a7e48fa4cd3834e6aee7d163bd67704b86e68e8cb15b28e4847048b8203772756031d212f737825d57d3aa1a574d33af0a00d4ee97277b"

RPROVIDES:${PN} += "application() application(org.qt.quickeffectmaker6.desktop) qt6-quickeffectmaker qt6-quickeffectmaker(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DGlslParser.so.6()(64bit) libQt6Quick3DGlslParser.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6ShaderTools.so.6()(64bit) libQt6ShaderTools.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
