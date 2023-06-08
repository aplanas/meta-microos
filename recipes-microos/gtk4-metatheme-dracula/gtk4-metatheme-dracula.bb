SUMMARY = "GTK+ 4 support for the Dracula theme"
DESCRIPTION = "This is a dark theme for GTK-3 and GTK-2 based desktop environments like \
Gnome, XFCE, Mate, Cinnamon, etc. Also provides support for KDE plasma. \
 \
This package provides the GTK+ 4 support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "gtk4-metatheme-dracula-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "e03496dc10d73e9252b737ace18e28f1432973ca93ad07ef27eacf8d704d750bdc0547dd7f57bc88344288d5350fb305e1b48cf4b79f86f01796a0ab8b787802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme gtk4-metatheme-dracula"
RDEPENDS:${PN} += "metatheme-dracula-common"

inherit rpm
