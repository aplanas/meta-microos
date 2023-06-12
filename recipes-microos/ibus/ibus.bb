SUMMARY = "The 'Intelligent Input Bus' input method"
DESCRIPTION = "IBus, short for Intelligent Input Bus, is an input framework. IBus \
plugins then provide the particular logic how to translate keypresses \
to input characters and possibly show disambiguation windows around \
the text cursor."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "372298955a4e05d8f7978f76ebfb78a7e57dcfb48918a9ca82535a4151700984d19d12214ddac977d08fab5328d6e8da369429e43af4c695374c6073799f4610"

RPROVIDES:${PN} += "application() \
application(org.freedesktop.IBus.Panel.Emojier.desktop) \
application(org.freedesktop.IBus.Panel.Extension.Gtk3.desktop) \
application(org.freedesktop.IBus.Setup.desktop) \
config(ibus) \
ibus \
ibus(aarch-64) \
locale(ja;ko;zh) \
rpm_macro(_ibus_autostartdir) \
rpm_macro(_ibus_componentdir) \
rpm_macro(_ibus_datadir) \
rpm_macro(_ibus_enginedir) \
rpm_macro(_ibus_icondir) \
rpm_macro(_ibus_includedir) \
rpm_macro(_ibus_keymapdir) \
rpm_macro(_ibus_libdir) \
rpm_macro(_ibus_libexecdir) \
rpm_macro(_ibus_setupdir) \
rpm_macro(_ibus_tabledir) \
rpm_macro(ibus_requires) \
rpm_macro(ibus_table_index_post) \
rpm_macro(ibus_table_requires)"
RDEPENDS:${PN} += "/bin/sh \
dconf \
ibus-dict-emoji \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdconf.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libibus-1_0-5 \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
python(abi) \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(GdkX11) \
typelib(Gio) \
typelib(Gtk) \
typelib(IBus) \
typelib(Pango) \
typelib-1_0-Gtk-3_0"

inherit rpm
