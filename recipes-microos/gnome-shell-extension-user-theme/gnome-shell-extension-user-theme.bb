SUMMARY = "Allow the user to change GNOME Shell Themes"
DESCRIPTION = "This extension allows the user to switch to different themes. It's possible \
to pick system installed themes or even themes installed in the user's home."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-extension-user-theme-44.0-1.1.noarch.rpm"
RPM_HASH = "8f0619e41049904d26edeb0208c3c4ace98734350f275f98109cd00db02424648128891bda673ca7489156d5d72d3e614326dc17931c89e8c082a7dc5d9a278c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-user-theme"
RDEPENDS:${PN} += "typelib(Adw) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Gtk)"

inherit rpm
