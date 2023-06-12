SUMMARY = "SiS and XGI video driver for the Xorg X server"
DESCRIPTION = "sis is an Xorg driver for SiS (Silicon Integrated Systems) and XGI video \
cards. \
 \
The driver is accelerated and provides support for colordepths of 8, 16 \
and 24 bpp. XVideo, Render and other extensions are supported as well."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.12.0"

RPM_NAME = "xf86-video-sis-0.12.0-1.16.aarch64.rpm"
RPM_HASH = "cc916cc7dbf84e1071464b601594d26f1ece879b10d172a0971a7e0ada4b24ea39e437b71c0713786ac79dccfa282466973629d7cf459c842f3ed74f495c412a"

RPROVIDES:${PN} += "xf86-video-sis \
xf86-video-sis(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
