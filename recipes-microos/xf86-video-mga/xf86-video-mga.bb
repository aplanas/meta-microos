SUMMARY = "Matrox video driver for the Xorg X server"
DESCRIPTION = "mga is an Xorg driver for Matrox video cards. \
 \
The driver is fully accelerated, and provides support for the following \
framebuffer depths: 8, 15, 16, 24, and an 8+24 overlay mode. All visual \
types are supported for depth 8, and both TrueColor and DirectColor \
visuals are supported for the other depths except 8+24 mode which \
supports PseudoColor, GrayScale and TrueColor. Multi-card configurations \
are supported. XVideo is supported on G200 and newer systems, with \
either TexturedVideo or video overlay. The second head of dual-head \
cards is supported for the G450 and G550. Support for the second head on \
G400 cards requires a binary-only 'mga_hal' module that is available \
from Matrox, and may be on the CD supplied with the card. That module \
also provides various other enhancements, and may be necessary to use \
the DVI (digital) output on the G550 (and other cards)."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "xf86-video-mga-2.0.1-1.4.aarch64.rpm"
RPM_HASH = "05e6f15fff9d4f39ba6c8beda4da7b57350d8f8833e14e6dddba063fd38540ed9b6b8327ec672359af2cae94a4c953e55d17a81d1e10cb093a547fdaba43cfbf"

RPROVIDES:${PN} += "xf86-video-mga \
xf86-video-mga(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
