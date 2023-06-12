SUMMARY = "Simple Scanning Utility"
DESCRIPTION = "Simple Scan is an easy-to-use application, designed to let users connect \
their scanner and quickly have the image/document in an appropriate \
format. \
 \
Simple Scan is basically a frontend for SANE - which is the same backend \
as XSANE uses. This means that all existing scanners will work and the \
interface is well tested."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "simple-scan-44.0-1.1.aarch64.rpm"
RPM_HASH = "dc506fbf85f169fc035e13b5afa74606da9bea9ed87037b5ece7038cfd5a39cd0bf242a71f88dc8b040b3b7dcf786a63091d92a4632aa0d21e9b26ac2abff414"

RPROVIDES:${PN} += "application() \
application(simple-scan.desktop) \
metainfo() \
metainfo(simple-scan.appdata.xml) \
simple-scan \
simple-scan(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcolord.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgusb.so.2()(64bit) \
libgusb.so.2(LIBGUSB_0.1.0)(64bit) \
libgusb.so.2(LIBGUSB_0.2.2)(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpackagekit-glib2.so.18()(64bit) \
libsane.so.1()(64bit) \
libwebp.so.7()(64bit) \
libwebpmux.so.3()(64bit) \
libz.so.1()(64bit) \
xdg-utils"

inherit rpm
