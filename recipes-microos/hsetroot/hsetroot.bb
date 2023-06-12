SUMMARY = "Advanced wallpaper tool for X"
DESCRIPTION = "hsetroot is a tool which allows you to compose wallpapers ('root pixmaps') for \
X. It has a lot of options like rendering gradients, solids, images but it also \
allows you to perform manipulations on those things, or chain them together. \
You could use one standard background image for isntance, and using tint to \
make it fit your current theme. And yes, of course it is compatible with \
semi-translucent applications like aterm and xchat :) \
 \
At this time, hsetroot can render: gradients (multi-color with variable \
distance), solids (rectangles) and images (centered, tiled, fullscreen, or \
maximum aspect). It supports the following manipulations: tinting (overlaying a \
color mask), blurring, sharpening, flipping (horizontally, diagonally, \
vertically) it also allows you to adjust brightness, contrast and gamma-level. \
hsetroot also supports alpha-channels when rendering things."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "hsetroot-1.0.5-2.9.aarch64.rpm"
RPM_HASH = "4cf4eb38bc0547a3b1253f794ad4fd2ee29df5389bb8e7827b768eb597eb8b772f38805db7b8a9689c3a31085c520fcdbe68cfb8db89306f8284631306f63d3d"

RPROVIDES:${PN} += "hsetroot \
hsetroot(aarch-64)"
RDEPENDS:${PN} += "imlib2-filters \
imlib2-loaders \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
