SUMMARY = "The slick-looking login screen application"
DESCRIPTION = "The slick-looking greeter (login screen) application. \
It is implemented as a LightDM greeter."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "lightdm-slick-greeter-1.6.1-1.3.aarch64.rpm"
RPM_HASH = "c61cab2df08f55ffd1221923b7d71d244211ba29339acf2039019c37d86e9468f67ee1b1985b11a8d7ff5e41e2e4203c440fb1c3d2067e68860fa0ddb3e9b5f7"

RPROVIDES:${PN} += "lightdm-greeter \
lightdm-slick-greeter \
lightdm-slick-greeter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
liblightdm-gobject-1.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
lightdm \
numlockx \
update-alternatives"

inherit rpm
