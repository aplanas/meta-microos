SUMMARY = "Libguestfs GObject introspection data"
DESCRIPTION = "This package contains the GObject introspection data."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-typelib-Guestfs-1_0-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "50407d3e951f6c7aeb84c5474c24ca6133b6d228bd4bb5543fc40dffe86c83dfc902746376fb141a1ac8d75c4953f037b6295f53c9c12bca06a69520ed32b651"

RPROVIDES:${PN} += "libguestfs-typelib-Guestfs-1_0 libguestfs-typelib-Guestfs-1_0(aarch-64) typelib(Guestfs)"
RDEPENDS:${PN} += "libguestfs-gobject-1.0.so.0()(64bit) libguestfs.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
