SUMMARY = "Introspection bindings for Evolution Data Server's Messaging Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for library for messaging."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "typelib-1_0-Camel-1_2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "cc193a8773fcec27264567710f2417fa7a84c645216fe03bb2baf1a166d18cf1b4af604e0328f174bbcdbfa15c535ac58d28ee20a39a7cf846f5d09978b9be19"

RPROVIDES:${PN} += "typelib(Camel) typelib-1_0-Camel-1_2 typelib-1_0-Camel-1_2(aarch-64)"
RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) typelib(GLib) typelib(GObject) typelib(Gio) typelib(libxml2)"

inherit rpm
