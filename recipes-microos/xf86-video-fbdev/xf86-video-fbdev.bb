SUMMARY = "Framebuffer video driver for the Xorg X server"
DESCRIPTION = "fbdev is an Xorg driver for framebuffer devices. \
 \
This is a non-accelerated driver, the following framebuffer depths are \
supported: 8, 15, 16, 24. All visual types are supported for depth 8, \
and TrueColor visual is supported for the other depths. Multi-head \
configurations are supported."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "xf86-video-fbdev-0.5.0-3.4.aarch64.rpm"
RPM_HASH = "3b6e8d9dd15308b310b75ac15c7066d92db458f9088a52f7265cdf26648e85b22aada6392c1e8ee133ca353f4c02611688dfa2703ad8dfa7c1af15009b37142b"

RPROVIDES:${PN} += "xf86-video-fbdev xf86-video-fbdev(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_VIDEODRV ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
