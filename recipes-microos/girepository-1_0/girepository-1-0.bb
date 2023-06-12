SUMMARY = "Base GObject Introspection Bindings"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.76.1"

RPM_NAME = "girepository-1_0-1.76.1-2.1.aarch64.rpm"
RPM_HASH = "2076e1d334d7300c8e64ecc08045b7a8f18e9c8319c7d87aa95e863341f3ace602a8062ab1b7bba7d47e7203a88c739a0746041d436c71169097800a24f13fd9"

RPROVIDES:${PN} += "girepository-1_0 \
girepository-1_0(aarch-64) \
typelib(DBus) \
typelib(DBusGLib) \
typelib(GIRepository) \
typelib(GL) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio) \
typelib(Vulkan) \
typelib(cairo) \
typelib(fontconfig) \
typelib(freetype2) \
typelib(libxml2) \
typelib(win32) \
typelib(xfixes) \
typelib(xft) \
typelib(xlib) \
typelib(xrandr)"
RDEPENDS:${PN} += "libgirepository-1_0-1"

inherit rpm
