SUMMARY = "Common files for the Dracula theme"
DESCRIPTION = "This is a dark theme for GTK-3 and GTK-2 based desktop environments like \
Gnome, XFCE, Mate, Cinnamon, etc. Also provides support for KDE plasma. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "metatheme-dracula-common-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "6d33ca043a22ffa72a5a2c86aceaafdce0ffed7f5963a8828bc27c6a0ecab139e63530c9e40f18dd3d25213b9226298be82b9c5bebe0f58486ad2b8c4d96d737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme metatheme-dracula-common"
RDEPENDS:${PN} += ""

inherit rpm
