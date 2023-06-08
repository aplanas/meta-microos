SUMMARY = "GTK+ 3 support for the Dracula theme"
DESCRIPTION = "This is a dark theme for GTK-3 and GTK-2 based desktop environments like \
Gnome, XFCE, Mate, Cinnamon, etc. Also provides support for KDE plasma. \
 \
This package provides the GTK+ 3 support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "gtk3-metatheme-dracula-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "e6f72efb718facdafbcddedf28495a4b2c62b138c6d724e849235efff4e571b609fd96c9b984946103a32771ac8c97821a0b9386e6582db559e762cf736fb4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme gtk3-metatheme-dracula"
RDEPENDS:${PN} += "metatheme-dracula-common"

inherit rpm
