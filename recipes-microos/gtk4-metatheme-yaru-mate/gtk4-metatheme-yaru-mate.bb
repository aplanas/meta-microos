SUMMARY = "GTK+ 4 support for the Yaru-MATE Gtk Themes"
DESCRIPTION = "Includes the Yaru-MATE themes. \
 \
Introduced as the default theme in Ubuntu MATE 21.04."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "gtk4-metatheme-yaru-mate-22.04.17-1.4.noarch.rpm"
RPM_HASH = "e576c42000e2757261f85256cedd0ade0431f7508228b83048c0cedc9f595ed3c5f6e1e495f7c65bb9be05ff2e7824c152782ee09851da2802fe2753f09ea027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-yaru-mate"
RDEPENDS:${PN} += "metatheme-yaru-mate-common"

inherit rpm
