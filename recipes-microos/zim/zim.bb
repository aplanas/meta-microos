SUMMARY = "A Desktop Wiki"
DESCRIPTION = "Zim is a graphical text editor used to maintain a collection of wiki \
pages. Each page can contain links to other pages, simple formatting and \
images. Pages are stored in a folder structure, like in an outliner, and \
can have attachments. Creating a new page is as easy as linking to a \
nonexistent page. All data is stored in plain text files with wiki \
formatting. Various plugins provide additional functionality, like a \
task list manager, an equation editor, a tray icon, and support for \
version control."
LICENSE = "GPL-2.0-or-later"

PV = "0.75.1"

RPM_NAME = "zim-0.75.1-2.2.noarch.rpm"
RPM_HASH = "8f7b67b9cdc396ca33cc091b14d45b940dc1ee68366ae089eccdbd4f924be1284043f12a4918abef0e7bc5f2a7761db73ff9c3ed241614238bbda33c29a3fafb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(zim.desktop) metainfo() metainfo(org.zim_wiki.Zim.appdata.xml) mimehandler(application/x-zim-notebook) mimehandler(text/x-zim-wiki) python3.10dist(zim) python3dist(zim) zim"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-gobject-Gdk python3-pyxdg typelib-1_0-Gtk-3_0 xdg-utils"

inherit rpm
