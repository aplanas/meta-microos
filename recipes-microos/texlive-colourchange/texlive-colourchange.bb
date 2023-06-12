SUMMARY = "Colourchange"
DESCRIPTION = "The package allows you to change the colour of the structural \
elements (inner theme and outer theme) of your beamer \
presentation during the presentation. There is a manual option \
but there is also the option to have your structure colour \
change from one colour to another as a function of how far \
through the presentation you are."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.22svn21741"

RPM_NAME = "texlive-colourchange-2023.201.1.22svn21741-53.1.noarch.rpm"
RPM_HASH = "279b9f2bda2c2cc1a20c10d837865a4607721a864ab0807d97e32cdb1eb3827e5b346e5630b644becb38f4aadcbbfccf20b1ccb0ed96c62f839872d09c050257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(colourchange.sty) \
texlive-colourchange"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(etoolbox.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
