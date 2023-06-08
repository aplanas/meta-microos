SUMMARY = "matecomponent-based library for the MATE Panel Applet"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.2"

RPM_NAME = "libmate-panel-applet-4-1-1.26.2-2.3.aarch64.rpm"
RPM_HASH = "0cabf60810f5398784d8cc394d4583d949fa682f647a25d96b6b9ab9e72b7cde4302620ad353f7396bbfce4cbc4c4238e38d9b466e98a08cab5128cfeb4cb258"

RPROVIDES:${PN} += "libmate-panel-applet-4-1 libmate-panel-applet-4-1(aarch-64) libmate-panel-applet-4.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
