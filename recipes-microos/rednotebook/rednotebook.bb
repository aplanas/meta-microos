SUMMARY = "Graphical diary and journal"
DESCRIPTION = "RedNotebook is a graphical journal to keep track of notes and thoughts. \
It includes a calendar navigation, customizable templates, export \
functionality and word clouds. You can also format, tag and search your \
entries."
LICENSE = "GPL-3.0-or-later"

PV = "2.29.6"

RPM_NAME = "rednotebook-2.29.6-1.1.noarch.rpm"
RPM_HASH = "443d6da99f6d882fa2a52868f2ae465f8e64119ab7320d2e8409426a125f3c66258db4975ff031a8edd45f51aad37af91476e76ad49df96979a25c0c05f2d8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(rednotebook.desktop) metainfo() metainfo(rednotebook.appdata.xml) python3.10dist(rednotebook) python3dist(rednotebook) rednotebook"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-gobject-Gdk typelib(GIRepository) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(GtkSource) typelib(Pango) typelib(WebKit2)"

inherit rpm
