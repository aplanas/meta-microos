SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libkdecorations2private10-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "5c3abddf88298408bd1d727ade8e1b8809440414c620049d1233360c3e86d2dae1dff0f61498a4054e34aa08281605fdc39514a45c6206de6a22b4029db81946"

RPROVIDES:${PN} += "libkdecorations2private.so.10()(64bit) \
libkdecorations2private10 \
libkdecorations2private10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
