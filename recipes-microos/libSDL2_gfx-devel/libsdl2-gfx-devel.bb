SUMMARY = "Libraries, includes and more to develop SDL2_gfx applications"
DESCRIPTION = "Library containing 20+ graphics primitives (line, box, circle, polygon, etc.) for SDL2."
LICENSE = "Zlib"

PV = "1.0.4"

RPM_NAME = "libSDL2_gfx-devel-1.0.4-2.7.aarch64.rpm"
RPM_HASH = "bfe744db7f4179f9bbcea54652c94b20852c553a581815f9d8d3bcf237010049a99378a51703a205d918ca278d133ae3e60cd4a213b01745023a50c8314a297f"

RPROVIDES:${PN} += "SDL2_gfx-devel \
libSDL2_gfx-devel \
libSDL2_gfx-devel(aarch-64) \
pkgconfig(SDL2_gfx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2_gfx-1_0-0 \
pkgconfig(sdl2)"

inherit rpm
