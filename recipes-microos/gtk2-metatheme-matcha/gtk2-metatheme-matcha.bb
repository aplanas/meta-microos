SUMMARY = "Matcha GTK+2 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK2+ themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "gtk2-metatheme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "8f574b5c2f3aa7ffb7daa00a7f53873f5e5b877b9acea74a5aeddcdcb5d6b0a8d0b82160ae76aee8ec8bda4d5bf38e4b8cfc2a36ea7c876edbe190096ae1ec80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-matcha"
RDEPENDS:${PN} += "gtk2 gtk2-engine-murrine metatheme-matcha-common"

inherit rpm
