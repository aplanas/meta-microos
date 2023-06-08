SUMMARY = "MATE Desktop multimedia stack"
DESCRIPTION = "This package provides the Multimedia stack used by the MATE Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "mate-media-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "7c4c485adb165b6b0fe0a9f31a9aff446fd707e5516f5b1d6a8eb6f049b3bcb8df43cfcccc8c0ef988b7bd7ef53eedcbc231f41336f07319bbcef2ce34b8fb9b"

RPROVIDES:${PN} += "application() application(mate-volume-control.desktop) mate-media mate-media(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcanberra-gtk3.so.0()(64bit) libcanberra.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmate-desktop-2.so.17()(64bit) libmate-panel-applet-4.so.1()(64bit) libmatemixer.so.0()(64bit) libpango-1.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
