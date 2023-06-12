SUMMARY = "Binary files of arara"
DESCRIPTION = "Binary files of arara"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29036"

RPM_NAME = "texlive-arara-bin-2023.20230311.svn29036-91.1.aarch64.rpm"
RPM_HASH = "8d9f468975c793ed0f4d1764d5eaa30cfcc60421228170699131b00bbf0e66e1b9a5390b37097921d507c391d6cc1c89727e312c5f1c38685103ecc517df48ff"

RPROVIDES:${PN} += "texlive-arara-bin \
texlive-arara-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-arara"

inherit rpm
