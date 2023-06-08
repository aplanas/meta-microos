SUMMARY = "MATE Desktop menu editor"
DESCRIPTION = "This package provides Mozo, a menu editor for the MATE Desktop, \
using the freedesktop.org menu specification."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.2"

RPM_NAME = "mozo-1.26.2-1.2.noarch.rpm"
RPM_HASH = "4844bdcf19841cf10b9211b1855f39a45f837373ebac012ea23a953511eb08ee90664134fabc486a0bca6c32e3e04696e3801b303f62d6fa23ab2f4002c85b1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(mozo.desktop) mate-menu-editor mozo"
RDEPENDS:${PN} += "/usr/bin/python3 mate-menus python(abi) python3-gobject python3-gobject-Gdk typelib(GLib) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(MateMenu)"

inherit rpm
