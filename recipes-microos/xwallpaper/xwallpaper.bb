SUMMARY = "Wallpaper setting utility for X"
DESCRIPTION = "The xwallpaper utility allows you to set image files as your X wallpaper. JPEG, PNG, and XPM file formats are supported, all of them being configurable and therefore no fixed dependencies."
LICENSE = "ISC"

PV = "0.7.4"

RPM_NAME = "xwallpaper-0.7.4-1.3.aarch64.rpm"
RPM_HASH = "648629405cad86d6fbcebe229c3f30a99e9bd2faf18a7fba9f7ee3097f3ad56549dab828efe5d3abaa37e3d6e296c82494b9bf236d0e4074535e3c71c011b2c3"

RPROVIDES:${PN} += "xwallpaper xwallpaper(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libXpm.so.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libpixman-1.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libxcb-image.so.0()(64bit) libxcb-randr.so.0()(64bit) libxcb-util.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
