SUMMARY = "Classic single screen vertical shoot em up SDL"
DESCRIPTION = "XGalaga-SDL is a port of the popular X11 game XGalaga, \
a clone of Galaga, using the SDL library. \
XGalaga was originally written by Joe Rumsey."
LICENSE = "GPL-2.0+"

PV = "2.1.1.0"

RPM_NAME = "xgalaga-sdl-2.1.1.0-1.26.aarch64.rpm"
RPM_HASH = "9c69b7e949291bdbf8ebed3374fe792923d3ad79c30957afe7180bc4ce8983be4529328298709fba4563224823a8610daad0e3e53917f96145f8122315de5f07"

RPROVIDES:${PN} += "application() application(xgalaga-sdl.desktop) xgalaga-sdl xgalaga-sdl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL-1.2.so.0()(64bit) libSDL_gfx.so.15()(64bit) libSDL_image-1.2.so.0()(64bit) libSDL_mixer-1.2.so.0()(64bit) libSDL_ttf-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
