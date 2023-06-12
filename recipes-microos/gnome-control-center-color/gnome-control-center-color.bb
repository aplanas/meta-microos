SUMMARY = "Configuration panel for color management"
DESCRIPTION = "This package provides the color management configuration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-control-center-color-44.2-1.1.noarch.rpm"
RPM_HASH = "aba1d6d802908b7c9e78702966c25c82122fe98b0a435a5ff713324f374d1dd0b01aa54030571d76b2a988cfab9b5f74972baddd33db45a1faf625b659d8cda9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(gnome-color-panel.desktop) gnome-control-center-color"
RDEPENDS:${PN} += "colord gnome-color-manager gnome-control-center"

inherit rpm
