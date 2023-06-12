SUMMARY = "Severed fonts for texlive-skaknew"
DESCRIPTION = "The  separated fonts package for texlive-skaknew"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20031"

RPM_NAME = "texlive-skaknew-fonts-2023.201.svn20031-57.1.noarch.rpm"
RPM_HASH = "3b56f48b82a4f0b4ad42d5d4eb292040effd80f94bd86faa54382e9b4dd398905950676980e5f4d9aa2474ec9c661f2448043c28ae728673ed689f044fb076a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-skaknew-fonts) \
font(chessalphadiagram) \
font(skaknew-diagram) \
font(skaknew-diagramt) \
font(skaknew-figurine) \
font(skaknewfigurine) \
texlive-skaknew-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
