SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "typelib-1_0-GnomeDesktop-4_0-44.0-1.1.aarch64.rpm"
RPM_HASH = "70421f8bfa1fa9de2e282a914529a958a31b9224c8f3ec2cc3007af210f00bdc219e1058dd1c798bc764dc44384caddeb76f5e54fde6d3afd10df6b57a826afb"

RPROVIDES:${PN} += "typelib(GnomeDesktop) typelib-1_0-GnomeDesktop-4_0 typelib-1_0-GnomeDesktop-4_0(aarch-64)"
RDEPENDS:${PN} += "libgnome-desktop-4.so.2()(64bit) typelib(GDesktopEnums) typelib(GLib) typelib(GModule) typelib(GObject) typelib(GdkPixbuf) typelib(Gio)"

inherit rpm
