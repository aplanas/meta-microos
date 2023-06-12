SUMMARY = "Facility for Interactive Generation of Figures under the X Window System"
DESCRIPTION = "Xfig is a menu-driven tool that allows the user to draw and manipulate \
objects interactively in an X Window System window.  The resulting \
pictures can be saved, printed on PostScript printers, or converted to \
a variety of other formats (to allow inclusion in LaTeX documents, for \
example)."
LICENSE = "MIT"

PV = "3.2.8a"

RPM_NAME = "xfig-3.2.8a-3.8.aarch64.rpm"
RPM_HASH = "bb00dd96e7864fe9b8e98ca363ab381dd6ea45f941467e16e3852e903e849a0b3bca565a9cb4c522629b1ab0e171615ddb4ad57b4be65b1edb8be5a2bea512e8"

RPROVIDES:${PN} += "application() \
application(xfig.desktop) \
mimehandler(application/x-xfig) \
xfig \
xfig(aarch-64) \
xfig.3.2.3d"
RDEPENDS:${PN} += "efont-unicode \
ghostscript-fonts-std \
ifnteuro \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw3d.so.8()(64bit) \
libXpm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
mkfontdir \
mkfontscale \
netpbm \
transfig \
xorg-x11-fonts \
xorg-x11-fonts-core"

inherit rpm
