SUMMARY = "GNOME Shell extension for onboard, an on-screen keyboard"
DESCRIPTION = "Onboard is an onscreen keyboard useful for tablet PC users and for mobility impaired users. \
 \
This GNOME Shell extension integrates the onboard keyboard with the GNOME Shell."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "gnome-shell-extension-onboard-1.4.1-7.6.noarch.rpm"
RPM_HASH = "9a0f8c8cfbf0a9d71892e451faab2f6792a6d23e3a3b4930712637e310c56f7cc29e526fd3c82cb8aa2e29323fb70a145934fc340662b54e9dd4c0735a73a2a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-onboard"
RDEPENDS:${PN} += "gnome-shell onboard typelib(Clutter) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Gtk) typelib(Shell) typelib(St)"

inherit rpm
