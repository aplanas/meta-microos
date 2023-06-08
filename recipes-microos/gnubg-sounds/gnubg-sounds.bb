SUMMARY = "Sounds for gnubg"
DESCRIPTION = "Sounds for GNU Backgammon. See description of gnubg for more details."
LICENSE = "GPL-3.0-or-later"

PV = "1.06.002"

RPM_NAME = "gnubg-sounds-1.06.002-3.4.noarch.rpm"
RPM_HASH = "1a469dfb32565b6e4dab3366318eb75e5950c5c230873ba860308aed9c353671da70ecfef361146688608577b3784b7be498f17f3aed6c43733896d698d12c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-sounds"
RDEPENDS:${PN} += "gnubg"

inherit rpm
