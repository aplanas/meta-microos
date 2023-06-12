SUMMARY = "On-screen Keyboard for GNOME -- Library"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "libcaribou0-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "2ff05dea6a5a54d3dcf8e7e1307d43b132c0733545a2b4a321dd639cb34c8971dc4fee7e36020f9c53122f2074e0dea5b9e2a292f0c950700f9a63fd0ed265a2"

RPROVIDES:${PN} += "libcaribou.so.0()(64bit) \
libcaribou0 \
libcaribou0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
caribou-common \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libxklavier.so.16()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
