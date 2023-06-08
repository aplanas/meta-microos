SUMMARY = "Mint-Y icon theme"
DESCRIPTION = "The flat, colourful, and modern theme based on Paper and Moka."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "1.5.8"

RPM_NAME = "mint-y-icon-theme-1.5.8-1.6.noarch.rpm"
RPM_HASH = "2ce64700314a6b36d96fb75eae2910e605e2465fd11071e8a22f3b60515603d3d63be478a15f48fe88f9101c824cf0862648c688dbb0140727e91034ba9a0a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mint-y-icon-theme"
RDEPENDS:${PN} += "adwaita-icon-theme gnome-icon-theme hicolor-icon-theme"

inherit rpm
