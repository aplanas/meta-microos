SUMMARY = "Examples for the qt6-quickeffectmaker modules"
DESCRIPTION = "Examples for the qt6-quickeffectmaker modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffectmaker-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dbe93e45a96bb7237291448ff0080016e8669311cc8be9992e99461980ab078417a3d2449663e4ad59040501cdf2944e3de902d7075d912900d014025cbe4291"

RPROVIDES:${PN} += "qt6-quickeffectmaker-examples \
qt6-quickeffectmaker-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
