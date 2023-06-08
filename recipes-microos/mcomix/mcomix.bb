SUMMARY = "Comics Viewer"
DESCRIPTION = "Comics Viewer forked from comix."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "mcomix-2.1.0-1.2.noarch.rpm"
RPM_HASH = "a7034cf108c63cb98b82d95a667562b2b3fdfd3d5aef2285dc150e2561e4dc448c0bac45dd402c0e7c5dc37299e60e7397d518f71a42020d288fe49e384bc9e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(mcomix.desktop) mcomix metainfo() metainfo(mcomix.appdata.xml) mimehandler(application/pdf) mimehandler(application/x-cb7) mimehandler(application/x-cbr) mimehandler(application/x-cbt) mimehandler(application/x-cbz) mimehandler(application/x-ext-cb7) mimehandler(application/x-ext-cbr) mimehandler(application/x-ext-cbt) mimehandler(application/x-ext-cbz) mimehandler(application/x-ext-pdf) mimehandler(application/x-pdf) mimehandler(image/bmp) mimehandler(image/gif) mimehandler(image/jpeg) mimehandler(image/png) mimehandler(image/tiff) mimehandler(image/x-MS-bmp) mimehandler(image/x-bmp) mimehandler(image/x-portable-bitmap) mimehandler(image/x-portable-graymap) mimehandler(image/x-portable-pixmap) python3.10dist(mcomix) python3dist(mcomix)"
RDEPENDS:${PN} += "/usr/bin/7z /usr/bin/python3 python(abi) python3-Pillow python3-gobject-Gdk python3-pycairo typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gtk) typelib(Pango) typelib(PangoCairo) typelib-1_0-Gtk-3_0"

inherit rpm
