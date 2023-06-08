SUMMARY = "SiS and XGI video driver for the Xorg X server"
DESCRIPTION = "sis is an Xorg driver for SiS (Silicon Integrated Systems) and XGI video \
cards. \
 \
The driver is accelerated and provides support for colordepths of 8, 16 \
and 24 bpp. XVideo, Render and other extensions are supported as well."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.9.7"

RPM_NAME = "xf86-video-sisusb-0.9.7-1.28.aarch64.rpm"
RPM_HASH = "8468704780536580a4a6d567d657158a6327a4cd5870f54fd8cd608c3cb70b8e17d2d32fa3ba0bab93bd74638675b8be6be7705d5875048af7fc928639900706"

RPROVIDES:${PN} += "xf86-video-sisusb xf86-video-sisusb(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_VIDEODRV ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
