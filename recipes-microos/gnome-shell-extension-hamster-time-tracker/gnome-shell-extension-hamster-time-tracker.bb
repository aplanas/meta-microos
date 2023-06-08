SUMMARY = "Hamster time tracker extension for GNOME Shell"
DESCRIPTION = " \
GNOME Shell extension to track activities in hamster via the main \
GNOME shell menu. Packaged for openSUSE Factory because the \
upstream version on extensions.gnome.org often leaks behind current \
GNOME shell development."
LICENSE = "GPL-3.0-only"

PV = "3.0.3~10.10.0_42"

RPM_NAME = "gnome-shell-extension-hamster-time-tracker-3.0.3~10.10.0_42-7.11.noarch.rpm"
RPM_HASH = "fe7fba1ab28e01387e0e2b6f1b510d641ce30be1e651e2e280c10df4df61ad6a8519ddeaa137aab363ca889f7720ef9d37852f4b8c7c69e128ae5521fbdf0f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-hamster gnome-shell-extension-hamster-time-tracker"
RDEPENDS:${PN} += "gnome-shell hamster-time-tracker typelib(Clutter) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gio) typelib(Gtk) typelib(Meta) typelib(Shell) typelib(St)"

inherit rpm
