SUMMARY = "AMDGPU video driver for the Xorg X server"
DESCRIPTION = "amdgpu is an Xorg driver for AMD video cards. \
 \
Its autodetects whether your hardware has a CI or newer AMD Graphics Card"
LICENSE = "MIT"

PV = "23.0.0"

RPM_NAME = "xf86-video-amdgpu-23.0.0-1.3.aarch64.rpm"
RPM_HASH = "abd51ada91091d0821a6d7c3718bef64a374dd108f536ae61f3233fe802194a594efee2af3c61e02be1028a58d97707c212a41ab5577effa7714c248a3359e29"

RPROVIDES:${PN} += "xf86-video-amdgpu \
xf86-video-amdgpu(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrm_amdgpu.so.1()(64bit) \
libgbm.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
