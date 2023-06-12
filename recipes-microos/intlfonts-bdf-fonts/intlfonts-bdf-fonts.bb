SUMMARY = "Fonts from the GNU Intlfonts Package in BDF Format"
DESCRIPTION = "Fonts from the GNU intlfonts package in the BDF format. \
 \
These fonts are useful for printing exotic languages such as Thai, \
Tibetan, Vietnamese, Arabic, and more from within Emacs."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-bdf-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "e4ba8befd6d3caad87ba52408f89b6a91c609b2c893e1f95f61e0fcb450102f2a2eab1cd04026bf4c02f2226f2dc6d4cce8c303b5043d585e7c5f4101ce5cf94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intlfonts-bdf \
intlfonts-bdf-fonts"
RDEPENDS:${PN} += ""

inherit rpm
