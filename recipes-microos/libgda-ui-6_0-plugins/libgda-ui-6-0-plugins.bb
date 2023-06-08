SUMMARY = "GNU Data Access (GDA) Library - Plugins for UI Widgets"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-plugins-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "f37f0493f0bbfab85f71d362741b4e1a368cf2d2c6fed1fb7cc205e443e00ac2a89de772b7a6ee2c1ccd1d244e0a58a692d42820bda1e116b5ee45dfe9b03fff"

RPROVIDES:${PN} += "libgda-ui-6_0-plugins libgda-ui-6_0-plugins(aarch-64) libgda-ui-plugins-libgda-6.0.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgda-6.0.so.6.0.0()(64bit) libgda-ui-6.0.so.6.0.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
