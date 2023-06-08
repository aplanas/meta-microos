SUMMARY = "Framework for writing or integrating input methods and engines for Qt 6"
DESCRIPTION = "Qt VirtualKeyboard provides an input framework and reference keyboard frontend \
for Qt 6."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-virtualkeyboard-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "074818aa01407906d5b778d5ce64a30d479945c5e7ee01724af237a74ed6f510e442f6d5afd52d6bb9d3587d00260bd567829a25d3b4043608ffa30b3ed9e7c3"

RPROVIDES:${PN} += "libqtvirtualkeyboardplugin.so()(64bit) libqtvirtualkeyboardplugin.so(Qt_6)(64bit) libqtvirtualkeyboardplugin.so(Qt_6.0)(64bit) libqtvirtualkeyboardplugin.so(Qt_6.1)(64bit) libqtvirtualkeyboardplugin.so(Qt_6.2)(64bit) libqtvirtualkeyboardplugin.so(Qt_6.3)(64bit) libqtvirtualkeyboardplugin.so(Qt_6.4)(64bit) libqtvirtualkeyboardplugin.so(Qt_6.5)(64bit) libqtvirtualkeyboardplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-virtualkeyboard qt6-virtualkeyboard(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6VirtualKeyboard.so.6()(64bit) libQt6VirtualKeyboard.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
