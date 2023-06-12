SUMMARY = "2D vectorial/animation tool"
DESCRIPTION = "Tupitube is a design and authoring tool for digital artists \
interested in 2D animation. Its source code is based on the KTooN \
project. \
 \
Some of its main features are: basic illustration tools (shapes, fill, \
text), gradient tools, onion skin, brushes editor, pencil with smoothness \
support and a basic object library (for SVG files and raster images). \
 \
Using its modules of animation and reproduction, 2D projects can be exported \
to several formats such as OGG, MPEG, AVI, MOV and SWF. Additionally, the \
option of exporting image arrays as output is available."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "0.2.18"

RPM_NAME = "tupitube-0.2.18-3.4.aarch64.rpm"
RPM_HASH = "17f2bc2f546115538afe1b225d2f596a4ba65dbd47da7ed7ab8776e7f5d3edc8338a4de4dbccd50c8f6fd5166d49f590e3cbe84e49f3130760b691ea4a98c631"

RPROVIDES:${PN} += "application() \
application(tupitube.desktop) \
ktoon \
libjson-c.so.1()(64bit) \
liblibmypaint.so.1()(64bit) \
libqtmypaint.so.1()(64bit) \
librasterbrushes.so.1()(64bit) \
librastercolor.so.1()(64bit) \
librastermain.so.1()(64bit) \
libtupi.so.1()(64bit) \
libtupibase.so.1()(64bit) \
libtupibrush.so.1()(64bit) \
libtupicolor.so.1()(64bit) \
libtupicolorpalette.so.1()(64bit) \
libtupiexport.so.1()(64bit) \
libtupiexposure.so.1()(64bit) \
libtupifwcore.so.1()(64bit) \
libtupifwgui.so.1()(64bit) \
libtupigui.so.1()(64bit) \
libtupilibrary.so.1()(64bit) \
libtupimport.so.1()(64bit) \
libtupinet.so.1()(64bit) \
libtupiplayer.so.1()(64bit) \
libtupiplugincommon.so.1()(64bit) \
libtupiscenes.so.1()(64bit) \
libtupistore.so.1()(64bit) \
libtupitimeline.so.1()(64bit) \
libtupitwitter.so.1()(64bit) \
libtupiworkspace.so.1()(64bit) \
metainfo() \
metainfo(tupitube.appdata.xml) \
mimehandler(application/tup) \
tupi \
tupitube \
tupitube(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ffmpeg \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5MultimediaWidgets.so.5()(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libogg0 \
libquazip1-qt5.so.1.4.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtheora0 \
tupitube-plugins"

inherit rpm
