SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python310-gobject-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "6ab3e253cda5dbf14af573a8a915490c810beb90f82f4f24424d886cd33212db3e0af8ece5172a0d1c63aaf611a89bdf9de286e21d55db36bef20eee566497e2"

RPROVIDES:${PN} += "python3-gobject \
python3.10dist(pygobject) \
python310-gobject \
python310-gobject(aarch-64) \
python3dist(pygobject)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
python(abi) \
typelib(GLib) \
typelib(Gio)"

inherit rpm
