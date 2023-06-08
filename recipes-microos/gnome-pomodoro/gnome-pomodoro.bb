SUMMARY = "A time management utility for GNOME"
DESCRIPTION = "A GNOME utility that helps managing time according to Pomodoro Technique. It \
intends to improve productivity and focus by taking short breaks after every \
25 minutes of work."
LICENSE = "GPL-3.0-or-later"

PV = "0.23.1"

RPM_NAME = "gnome-pomodoro-0.23.1-1.1.aarch64.rpm"
RPM_HASH = "8b6decb82d4dc38e7c3c435b6d73c76d3d08a0078ad2849121c4ae4025fa84b0a86dfae3560ee91cd643b491888fc04935761982793403e0f854187cb8a89d96"

RPROVIDES:${PN} += "application() application(org.gnome.Pomodoro.desktop) gnome-pomodoro gnome-pomodoro(aarch-64) libactions.so()(64bit) libdark-theme.so()(64bit) libgnome-pomodoro.so.0()(64bit) libgnome.so()(64bit) libsounds.so()(64bit) metainfo() metainfo(org.gnome.Pomodoro.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig gnome-shell gstreamer gtk3 hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcanberra.so.0()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgom-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpeas-1.0.so.0()(64bit) libsqlite3.so.0()(64bit) typelib(Atk) typelib(Clutter) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Gtk) typelib(Pango) typelib(Shell) typelib(St)"

inherit rpm
