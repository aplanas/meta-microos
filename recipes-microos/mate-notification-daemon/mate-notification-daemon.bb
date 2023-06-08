SUMMARY = "Notification daemon for MATE"
DESCRIPTION = "D-Bus notification daemon for MATE."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-notification-daemon-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "4feee9778b1fd66da5040b74731dbe558ed1d49877682a812b3e7077c7cfc1ebae2e1c2a00811766505de05e887330e0a4cfc006b7e73fefff2c187a8dd4029a"

RPROVIDES:${PN} += "application() application(mate-notification-properties.desktop) dbus(org.freedesktop.Notifications) libcoco.so()(64bit) libnodoka.so()(64bit) libslider.so()(64bit) libstandard.so()(64bit) mate-notification-daemon mate-notification-daemon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcanberra-gtk3.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmate-desktop-2.so.17()(64bit) libmate-panel-applet-4.so.1()(64bit) libnotify.so.4()(64bit) libwnck-3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
