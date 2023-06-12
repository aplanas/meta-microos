SUMMARY = "Framework for writing or integrating input methods and engines for Qt 6"
DESCRIPTION = "Qt VirtualKeyboard provides an input framework and reference keyboard frontend \
for Qt 6."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0ce19274099dc1a2b65e1d4ec814d960885dec7dd2874cbee86e93336ef9da602adbe52fb43a974390bf36973d5d2fb0cadf3b0f3cc01ec9d216964e55680b6d"

RPROVIDES:${PN} += "libqtvirtualkeyboardplugin.so()(64bit) \
libqtvirtualkeyboardplugin.so(Qt_6)(64bit) \
libqtvirtualkeyboardplugin.so(Qt_6.0)(64bit) \
libqtvirtualkeyboardplugin.so(Qt_6.1)(64bit) \
libqtvirtualkeyboardplugin.so(Qt_6.2)(64bit) \
libqtvirtualkeyboardplugin.so(Qt_6.3)(64bit) \
libqtvirtualkeyboardplugin.so(Qt_6.4)(64bit) \
libqtvirtualkeyboardplugin.so(Qt_6.5)(64bit) \
libqtvirtualkeyboardplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-virtualkeyboard \
qt6-virtualkeyboard(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6VirtualKeyboard.so.6()(64bit) \
libQt6VirtualKeyboard.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
