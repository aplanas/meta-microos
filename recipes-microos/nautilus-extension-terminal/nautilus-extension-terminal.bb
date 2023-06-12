SUMMARY = "Nautilus Extension to Open Terminal in Folders"
DESCRIPTION = "This is a nautilus extension that allows you to open a terminal in \
arbitrary folders."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "nautilus-extension-terminal-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "a5f5d39adfafdab419b70c9f077b49cc1623d27a08f52ecf4f446c3a8b547727a2f8f7e676d5dcd05ef0f3833006ee5fef9700c15cc4dc4512f54fce374d1f37"

RPROVIDES:${PN} += "libterminal-nautilus.so.()(64bit) \
metainfo() \
metainfo(org.gnome.Terminal.Nautilus.metainfo.xml) \
nautilus-extension-terminal \
nautilus-extension-terminal(aarch-64) \
nautilus-open-terminal"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnautilus-extension.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
