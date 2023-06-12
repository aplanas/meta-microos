SUMMARY = "Introspection bindings for the flatpak library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "typelib-1_0-Flatpak-1_0-1.14.4-1.2.aarch64.rpm"
RPM_HASH = "3e728f01de6508e22997896e42ebec0fa7c09a70ace3bf32981241e7ce8170274dbf4131edeebbfe92dc8120f7353ed65e1541cdb5b4344c7d1c8dff3c3622c6"

RPROVIDES:${PN} += "typelib(Flatpak) \
typelib-1_0-Flatpak-1_0 \
typelib-1_0-Flatpak-1_0(aarch-64)"
RDEPENDS:${PN} += "libflatpak.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
