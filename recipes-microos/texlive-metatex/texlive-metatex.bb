SUMMARY = "Incorporate Metafont pictures in TeX source"
DESCRIPTION = "METATeX is a set of plain TeX and Metafont macros that you can \
use to define both the text and the figures in a single source \
file. Because METATeX sets up two way communication, from TeX \
to Metafont and back from Metafont to TeX, drawing dimensions \
can be controlled by TeX and labels can be located by Metafont. \
Only standard features of TeX and Metafont are used, but two \
runs of TeX and one of Metafont are needed."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-metatex-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "eaa1b1ed537bb6234f8199910bd36f4f948b4f905f13c904170f0932274a01b71748027991008972ecebdc9573cfc98aeb320a345ef695b63086707b692a4b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(metatex.tex) \
texlive-metatex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
