SUMMARY = "Devel package"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "malcontent-devel-0.10.4-1.5.aarch64.rpm"
RPM_HASH = "723d5417def8d5eab33b4b410009fef23eb7412a7e026b939d73c734407d8c059921d316cde1a342c98f570a5bbc286c91aac11f2e05d946e893fca0de3209dd"

RPROVIDES:${PN} += "malcontent-devel malcontent-devel(aarch-64) pkgconfig(malcontent-0) pkgconfig(malcontent-ui-0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmalcontent-0-0 libmalcontent-ui-0-0 pkgconfig(accountsservice) pkgconfig(appstream-glib) pkgconfig(flatpak) pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(malcontent-0) typelib-1_0-Malcontent-0 typelib-1_0-MalcontentUi-0"

inherit rpm
