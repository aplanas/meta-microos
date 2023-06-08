SUMMARY = "A GOG client for Linux that lets you download and play your GOG Linux games"
DESCRIPTION = "A GOG client for Linux that lets you download and play your GOG Linux games."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "minigalaxy-1.2.2-1.2.noarch.rpm"
RPM_HASH = "851803693be21c27196f4a63897f573255b83fe8da5880434d74bdc8b9ca65c7eba7719a0ef9e6e4aa827c514877efa2664aa65bd1a9e843b31cc54a88ad13fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(io.github.sharkwouter.Minigalaxy.desktop) metainfo() metainfo(io.github.sharkwouter.Minigalaxy.metainfo.xml) minigalaxy python3.10dist(minigalaxy) python3dist(minigalaxy)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-gobject python3-gobject-Gdk python3-requests typelib(GLib) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(WebKit2)"

inherit rpm
