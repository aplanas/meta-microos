SUMMARY = "An animated GIF recorder"
DESCRIPTION = "A simple tool that allows you to record short animated GIF images from your screen. \
Currently, only X11 window system is supported."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-1.5.1-2.17.aarch64.rpm"
RPM_HASH = "a1929f074c8e1e8aef1528e6ed37b0b8a8c73b70cbb3d7664528a0f4f04f1a2f6a8327ca3bc36ef246c9a318be890570287865f98a00e41ea8099a36bd623f4e"

RPROVIDES:${PN} += "application() application(com.uploadedlobster.peek.desktop) metainfo() metainfo(com.uploadedlobster.peek.appdata.xml) peek peek(aarch-64)"
RDEPENDS:${PN} += "ImageMagick ffmpeg ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libkeybinder-3.0.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
