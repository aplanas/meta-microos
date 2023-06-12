SUMMARY = "Private library for Budgie"
DESCRIPTION = "Private library for Budgie desktop to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgie-private0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "bfa201fe4b4388d54f49f5c1a407db8d87a2a98795ec400883e3c4c637a91edc1b6dab0d184b5746eff2c073486109ad053d504fa10ac623c9fe9181cdcdbe95"

RPROVIDES:${PN} += "libbudgie-private.so.0()(64bit) libbudgie-private0 libbudgie-private0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbudgie-plugin.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
