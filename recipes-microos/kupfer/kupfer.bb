SUMMARY = "An interface for access to applications and documents"
DESCRIPTION = "Kupfer is an interface for access to applications \
and their documents. \
 \
The most typical use is to find a specific application and launch it. \
Kupfer can be extended with plugins so that its quick-access \
paradigm can be extended to many more objects than just \
applications."
LICENSE = "GPL-3.0-or-later"

PV = "322"

RPM_NAME = "kupfer-322-1.1.noarch.rpm"
RPM_HASH = "3dca1aeae796eb3d4a9b2e9fbc6c0aded55bc68f23be275b0cc7803a5debc7da24ccc79686e280fa34811287a1b8a17e82c488019d12c27bfde53dab5f4687bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(kupfer-exec.desktop) application(kupfer.desktop) kupfer mimehandler(text/x-kfcom)"
RDEPENDS:${PN} += "/bin/sh desktop-file-utils gvfs hicolor-icon-theme python3-cairo python3-dbus-python python3-docutils python3-gobject python3-gobject-Gdk python3-libxml2 python3-pyxdg shared-mime-info typelib-1_0-Gtk-3_0 typelib-1_0-Keybinder-3_0 typelib-1_0-Wnck-3_0 update-desktop-files"

inherit rpm
