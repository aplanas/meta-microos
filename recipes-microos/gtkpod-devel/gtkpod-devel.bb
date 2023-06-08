SUMMARY = "Development files for gtkpod, a GUI for Apple iPods"
DESCRIPTION = "This package contains development headers for libgtkpod \
 \
gtkpod is a Platform-Independent GUI for the Apple iPod using GTK2. It \
allows you to upload songs and play lists to your iPod. It supports ID3 \
tag editing with multiple charsets for ID3 tags, detects duplicate \
songs, allows offline modification of the database with later \
synchronization, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "gtkpod-devel-2.1.5-6.18.aarch64.rpm"
RPM_HASH = "b11eb62ade96727f3ae4364edea6ff13718bf1db900c76094c676aca9aedf127a172c736b31ce8b8cb6c899f9be757c2e0d1c899f3e72a6d9806a2cbf3ec3996"

RPROVIDES:${PN} += "gtkpod-devel gtkpod-devel(aarch-64) pkgconfig(libgtkpod-1.1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libatomicparsley0 libgtkpod1 pkgconfig(gdl-3.0) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gthread-2.0) pkgconfig(gtk+-3.0) pkgconfig(libanjuta-3.0) pkgconfig(libgpod-1.0)"

inherit rpm
