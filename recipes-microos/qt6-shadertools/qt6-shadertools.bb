SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library and tools."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-shadertools-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d0c7719cba40c59f078775716e1ff4781aaf80a7cf516a4fc3733c52d32851fdcc0ca7caa8d0331186cadfbc2b510548cc8c297d0b8a5ed3012735b7a53b00c7"

RPROVIDES:${PN} += "qt6-shadertools qt6-shadertools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6ShaderTools.so.6()(64bit) libQt6ShaderTools.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) spirv-tools"

inherit rpm
