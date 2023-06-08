SUMMARY = "Open Source Implementation of the GDI+ API"
DESCRIPTION = "Mono library that provide a GDI+ comptible API on non-Windows \
operating systems."
LICENSE = "(LGPL-2.1-or-later | MPL-1.1) & MIT"

PV = "6.0.5"

RPM_NAME = "libgdiplus0-6.0.5-1.11.aarch64.rpm"
RPM_HASH = "f1195738aef8dc10568b79ec7ba64a15186c2fcab736e14be2c8402fa2ecfaa0975d7c54151384d33ce07615cad78c45338882eeb15cf01511a21f5df9ebf226"

RPROVIDES:${PN} += "libgdiplus.so.0()(64bit) libgdiplus0 libgdiplus0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libexif.so.12()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libgif.so.7()(64bit) libglib-2.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
