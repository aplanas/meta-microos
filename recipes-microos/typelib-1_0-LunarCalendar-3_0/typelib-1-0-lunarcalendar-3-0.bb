SUMMARY = "Introspection bindings for lunar-calendar"
DESCRIPTION = "This package contains the introspection bindings for the lunar-calendar library."
LICENSE = "GPL-2.0+"

PV = "3.0.0+git20191124.f91a880"

RPM_NAME = "typelib-1_0-LunarCalendar-3_0-3.0.0+git20191124.f91a880-1.15.aarch64.rpm"
RPM_HASH = "cd2aee56855a4233eebbe4c45dd83947446053eaffded48a9188b02638f5113cd10331e12aa1af0f8afe98ac5169177ee4e73cde004ea9299273d15f8cf56190"

RPROVIDES:${PN} += "typelib(LunarCalendar) typelib-1_0-LunarCalendar-3_0 typelib-1_0-LunarCalendar-3_0(aarch-64)"
RDEPENDS:${PN} += "liblunar-calendar-3.0.so.1()(64bit) lunar-calendar typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(LunarDate) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
