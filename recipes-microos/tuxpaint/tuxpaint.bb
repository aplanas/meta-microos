SUMMARY = "Drawing Program for Young Children"
DESCRIPTION = "Tux Paint' is a drawing program for young children. It has a simple \
interface and fixed canvas size, and provides access to previous images \
using a thumbnail browser (it provides no access to the underlying \
filesystem). \
 \
Unlike drawing programs such as 'The GIMP', it has a very \
limited toolset. However, it provides a much simpler interface, and has \
entertaining, child-oriented additions such as sound effects."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.27"

RPM_NAME = "tuxpaint-0.9.27-2.7.aarch64.rpm"
RPM_HASH = "f248fcb8c08fd613d7dff8c3cb40f7e36052a9046be224b6445fc59469b43b70a1a3625190bf5dffaa61e822884c7768a5834fdb60f7c3f1b54bb19404c37dd2"

RPROVIDES:${PN} += "application() application(tuxpaint.desktop) config(tuxpaint) tuxpaint tuxpaint(aarch-64)"
RDEPENDS:${PN} += "/bin/bash freefont ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL-1.2.so.0()(64bit) libSDL_Pango.so.1()(64bit) libSDL_gfx.so.15()(64bit) libSDL_image-1.2.so.0()(64bit) libSDL_mixer-1.2.so.0()(64bit) libSDL_ttf-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfribidi.so.0()(64bit) libgobject-2.0.so.0()(64bit) libimagequant.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpaper.so.2()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) librsvg-2.so.2()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) netpbm"

inherit rpm
