SUMMARY = "MATE Desktop UPower policy management"
DESCRIPTION = "MATE Power Manager is a MATE session daemon that acts as a policy \
agent on top of UPower, which requires fairly new versions of the \
kernel and udev. MATE Power Manager listens for system events and \
responds with user-configurable actions."
LICENSE = "GPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "mate-power-manager-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "0c1c710d0c4b4e4ff60d841f33dd750bff7ae07f27ec23f7a14e1c91babc26e2862ed25c05dd5805c112f8d0f3f7403eb8429b20edbf8d54578e1b2048a1b56b"

RPROVIDES:${PN} += "application() application(mate-power-preferences.desktop) application(mate-power-statistics.desktop) mate-power-manager mate-power-manager(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcanberra-gtk3.so.0()(64bit) libcanberra.so.0()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdbus-glib-1.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libmate-panel-applet-4.so.1()(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libsecret-1.so.0()(64bit) libupower-glib.so.3()(64bit) upower"

inherit rpm
