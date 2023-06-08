SUMMARY = "Matcha GNOME Shell themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GNOME Shell themes."
LICENSE = "GPL-3.0-only"

PV = "20221115"

RPM_NAME = "gnome-shell-theme-matcha-20221115-1.1.noarch.rpm"
RPM_HASH = "a07f7d6564e3d082f3ac7b40af677ac35e875bcf9db9ed211726f114f241d8dd7d0a8e3b5d1683191e34db40daa0041d4d82c0314944b367029861c4205c8a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-theme-matcha"
RDEPENDS:${PN} += "gnome-shell metatheme-matcha-common"

inherit rpm
