SUMMARY = "Libraries, includes and more to develop SDL_image applications"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12+hg695"

RPM_NAME = "libSDL_image-devel-1.2.12+hg695-1.14.aarch64.rpm"
RPM_HASH = "c122f82b1e151f4ed1610275a87a6d42f10336ffb59e5cd50c59642146a06c0e5e095a01b036d4547ff27e798662a62e3f6abc96ac7d354c60aad5f51ab58968"

RPROVIDES:${PN} += "SDL_image-devel libSDL_image-devel libSDL_image-devel(aarch-64) pkgconfig(SDL_image)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSDL_image-1_2-0 pkgconfig(sdl)"

inherit rpm
