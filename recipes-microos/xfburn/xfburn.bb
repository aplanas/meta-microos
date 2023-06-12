SUMMARY = "Simple CD/DVD Burning Application"
DESCRIPTION = "Xfburn is a simple CD/DVD burning application based on the libburnia libraries. \
It can blank CD-RWs, burn and create iso images, as well as burn personal \
compositions of data to either CD or DVD."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "xfburn-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "b4f08eebeac79e3a432e951a1adc451de99ba628c6509cdb51a8ff903c10ca04dd1d4c6a8a90b6067b6e7f3c10e38a00bcfb1accfbe14730c770153432646337"

RPROVIDES:${PN} += "application() \
application(xfburn.desktop) \
metainfo() \
metainfo(org.xfce.xfburn.appdata.xml) \
mimehandler(application/x-cd-image) \
mimehandler(x-content/audio-cdda) \
mimehandler(x-content/blank-cd) \
xfburn \
xfburn(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libburn.so.4()(64bit) \
libburn.so.4(LIBBURN4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexo-2.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libisofs.so.6()(64bit) \
libisofs.so.6(LIBISOFS6)(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit)"

inherit rpm
