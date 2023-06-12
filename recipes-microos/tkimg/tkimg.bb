SUMMARY = "More Image Formats for Tk"
DESCRIPTION = "This package contains a collection of image format handlers for the Tk \
photo image type, and a new image type, pixmaps. \
 \
The provided format handlers include bmp, gif, ico, jpeg, pcx, png, \
ppm, ps, sgi, sun, tga, tiff, xbm, and xpm."
LICENSE = "BSD-3-Clause"

PV = "1.4.13"

RPM_NAME = "tkimg-1.4.13-2.1.aarch64.rpm"
RPM_HASH = "a370ca409190bdc855cc6f9abdc39cfa835060b99d3e44992d3d65d10d666bab7204f832d427a008f1034907ac9cb680ef938e0e0729f42c3c08b98520e29051"

RPROVIDES:${PN} += "libjpegtcl9.4.0.so()(64bit) \
libpngtcl1.6.37.so()(64bit) \
libtifftcl4.1.0.so()(64bit) \
libtkimg1.4.13.so()(64bit) \
libtkimgbmp1.4.13.so()(64bit) \
libtkimgdted1.4.13.so()(64bit) \
libtkimgflir1.4.13.so()(64bit) \
libtkimggif1.4.13.so()(64bit) \
libtkimgico1.4.13.so()(64bit) \
libtkimgjpeg1.4.13.so()(64bit) \
libtkimgpcx1.4.13.so()(64bit) \
libtkimgpixmap1.4.13.so()(64bit) \
libtkimgpng1.4.13.so()(64bit) \
libtkimgppm1.4.13.so()(64bit) \
libtkimgps1.4.13.so()(64bit) \
libtkimgraw1.4.13.so()(64bit) \
libtkimgsgi1.4.13.so()(64bit) \
libtkimgsun1.4.13.so()(64bit) \
libtkimgtga1.4.13.so()(64bit) \
libtkimgtiff1.4.13.so()(64bit) \
libtkimgwindow1.4.13.so()(64bit) \
libtkimgxbm1.4.13.so()(64bit) \
libtkimgxpm1.4.13.so()(64bit) \
libzlibtcl1.2.11.so()(64bit) \
tkimg \
tkimg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
