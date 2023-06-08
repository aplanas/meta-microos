SUMMARY = "A password manager for GNOME"
DESCRIPTION = "Secrets is a password manager which makes use of the Keepass v.4 \
format. \
It integrates with the GNOME desktop and provides an interface for \
the management of password databases."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "secrets-7.3-1.1.noarch.rpm"
RPM_HASH = "e49a1e3c3171a8d323f304ad62a79ca459ba1da53e8b4ce0870a49a554be5c096d29175cd8dbbc3b9bd96ad9d480c6016d101ec1a3efd952fb8c6c7b15b8e162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.gnome.World.Secrets.desktop) gnome-passwordsafe metainfo() metainfo(org.gnome.World.Secrets.metainfo.xml) mimehandler(application/x-keepass2) secrets"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-argon2-cffi python3-gobject-Gdk python3-lxml python3-pycryptodome python3-pykeepass python3-pyotp python3-validators python3-zxcvbn typelib(Adw) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gio) typelib(Graphene) typelib(Gtk)"

inherit rpm
