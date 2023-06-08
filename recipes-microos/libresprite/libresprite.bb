SUMMARY = "Animated sprite editor & pixel art tool"
DESCRIPTION = "LibreSprite is an open source program to create animated sprites \
for websites and games."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.0"

RPM_NAME = "libresprite-1.0-2.1.aarch64.rpm"
RPM_HASH = "2a3ecf903eeb08c03c945873b947df44f148fa510f0eea159988666b11a6ec08f64eb45346d2e5cace40606acadbcb6cf02dffd8fd7b6044cfb707b38cd30ddc"

RPROVIDES:${PN} += "application() application(libresprite.desktop) libresprite libresprite(aarch-64) metainfo() metainfo(libresprite.appdata.xml) mimehandler(image/bmp) mimehandler(image/gif) mimehandler(image/jpeg) mimehandler(image/png) mimehandler(image/vnd.microsoft.icon) mimehandler(image/webp) mimehandler(image/x-aseprite) mimehandler(image/x-pcx) mimehandler(image/x-tga) mimehandler(video/x-flic)"
RDEPENDS:${PN} += "/usr/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) libSDL2_image-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgif.so.7()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblua5.3.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpixman-1.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinyxml.so.0()(64bit) libwebp.so.7()(64bit) libxcb.so.1()(64bit) libz.so.1()(64bit)"

inherit rpm
