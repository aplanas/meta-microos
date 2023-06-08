SUMMARY = "GTK+ 2 support for the Yaru-MATE Gtk Themes"
DESCRIPTION = "Includes the Yaru-MATE themes. \
 \
Introduced as the default theme in Ubuntu MATE 21.04."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "gtk2-metatheme-yaru-mate-22.04.17-1.4.noarch.rpm"
RPM_HASH = "bcda0b19db19d7142dfa12b668176eb836f81205e4706a87fef856cbbc3c71c384ae6115b0aefcaa71e82982666fe1a05381d1323bb5d94a345b3ba837609554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-yaru-mate"
RDEPENDS:${PN} += "gtk2-engine-murrine metatheme-yaru-mate-common"

inherit rpm
