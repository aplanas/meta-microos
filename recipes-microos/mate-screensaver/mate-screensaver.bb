SUMMARY = "MATE Desktop screensaver"
DESCRIPTION = "mate-screensaver is a screen saver and locker that integrates with \
the MATE desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "mate-screensaver-1.26.2-1.1.aarch64.rpm"
RPM_HASH = "51acc7cf71e418ef82d47a4856dceffa374af3cf7fa5151e9ad8b291571b550eb97cefaacb74a3eb77b5803167a2484fd8fb2f84612239d729438fc7de3bd12f"

RPROVIDES:${PN} += "application() application(cosmos-slideshow.desktop) application(footlogo-floaters.desktop) application(gnomelogo-floaters.desktop) application(mate-screensaver-preferences.desktop) application(personal-slideshow.desktop) application(popsquares.desktop) config(mate-screensaver) mate-screensaver mate-screensaver(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXss.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdbus-glib-1.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmate-desktop-2.so.17()(64bit) libmate-menu.so.2()(64bit) libmatekbdui.so.4()(64bit) libnotify.so.4()(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpango-1.0.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libxklavier.so.16()(64bit) mate-session-manager-gschemas"

inherit rpm
