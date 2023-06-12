SUMMARY = "Tupi plugins"
DESCRIPTION = "A design and authoring tool for 2D animation. \
 \
This package contains plugins for tupitube."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "0.2.18"

RPM_NAME = "tupitube-plugins-0.2.18-3.4.aarch64.rpm"
RPM_HASH = "5121a0964cce276624635fb8041eba5814e357ca082e37c272e811cf33b52aee9179068eae3cca6c7a70e5f62e304598dfe564b12572eb26511ebd907f5999d9"

RPROVIDES:${PN} += "libtupicoloringtool.so()(64bit) \
libtupieyedropper.so()(64bit) \
libtupifilltool.so()(64bit) \
libtupigeometrictool.so()(64bit) \
libtupiimageplugin.so()(64bit) \
libtupiinktool.so()(64bit) \
libtupimotiontool.so()(64bit) \
libtupinodestool.so()(64bit) \
libtupiopacitytool.so()(64bit) \
libtupipapagayotool.so()(64bit) \
libtupipenciltool.so()(64bit) \
libtupipolylinetool.so()(64bit) \
libtupirotationtool.so()(64bit) \
libtupiscaletool.so()(64bit) \
libtupiselectiontool.so()(64bit) \
libtupisheartool.so()(64bit) \
libtupitexttool.so()(64bit) \
tupitube-plugins \
tupitube-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtupi.so.1()(64bit) \
libtupibase.so.1()(64bit) \
libtupifwcore.so.1()(64bit) \
libtupifwgui.so.1()(64bit) \
libtupiplugincommon.so.1()(64bit) \
libtupistore.so.1()(64bit) \
tupitube"

inherit rpm
