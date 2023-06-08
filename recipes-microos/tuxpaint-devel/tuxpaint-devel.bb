SUMMARY = "Devel files of tuxpaint"
DESCRIPTION = "Header files and development documentation for tuxpaint."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.27"

RPM_NAME = "tuxpaint-devel-0.9.27-2.7.aarch64.rpm"
RPM_HASH = "69aa0819473eff86193e2c97e7f8e671ced84013ba2ea90bf1e2fa9e30879d75b836411394100ab56b53798dbcdd667a31be1876f8109111608f12d3f5c0272c"

RPROVIDES:${PN} += "tuxpaint-devel tuxpaint-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gcc-c++ gettext-devel libpaper-devel libpng-devel pkgconfig(SDL_Pango) pkgconfig(SDL_image) pkgconfig(SDL_mixer) pkgconfig(SDL_ttf) pkgconfig(fribidi) pkgconfig(librsvg-2.0) pkgconfig(sdl) pkgconfig(zlib) tuxpaint"

inherit rpm
