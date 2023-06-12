SUMMARY = "SDL plugin for xine"
DESCRIPTION = "SDL xine video output plugin \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-sdl-1.2.13-2.2.aarch64.rpm"
RPM_HASH = "ba727386d86edec82c54e11615c7db39f71f2341f7c8448ac830a0c65773f497e3a2cec66651f5edf7c5967c8c6ac2bb555354b623a7f9b96898baf278ac9e25"

RPROVIDES:${PN} += "libxine2-sdl \
libxine2-sdl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxine.so.2()(64bit) \
libxine2"

inherit rpm
