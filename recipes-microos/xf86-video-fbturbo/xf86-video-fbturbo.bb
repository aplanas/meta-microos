SUMMARY = "Xorg DDX driver for ARM devices (Allwinner, RPi and others)"
DESCRIPTION = "Video driver, primarily optimized for the devices powered by the Allwinner SoC \
(A10, A13, A20). It can use some of the 2D/3D hardware acceleration features. \
 \
And because this driver is based on xf86-video-fbdev (with none of the original \
features stripped), it actually supports all the same hardware as \
xf86-video-fbdev. Essentially, xf86-video-fbturbo can be just used as a drop-in \
replacement and run on practically any Linux system. There will be no real \
difference on x86, but any ARM based system should see better performance \
thanks to some additional optimizations (the elimination of ShadowFB layer, ARM \
NEON/VFP code for dealing with uncached framebuffer reads, automatic backing \
store management for faster window moves)."
LICENSE = "X11 & GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "xf86-video-fbturbo-0.4.0-4.8.aarch64.rpm"
RPM_HASH = "078e1215f21a6e5ff8fb2bd2a0558e4da178ad0378818981cd3cef813a0b45640cd69a090738b3b6eb16fd6849ed157f5c4b81853fa26b110f35b8c611a81712"

RPROVIDES:${PN} += "xf86-video-fbturbo \
xf86-video-fbturbo(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
