SUMMARY = "Pretty-print Metafont source"
DESCRIPTION = "The mft program pretty-prints Metafont source code into a TeX \
file. The mftinc package facilitates incorporating such files \
into a LaTeX2e document. In addition, mftinc provides routines \
for improved comment formatting and for typesetting font \
tables."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn15878"

RPM_NAME = "texlive-mftinc-2023.201.1.0asvn15878-54.1.noarch.rpm"
RPM_HASH = "30efc4e505be95811a2ba0648316fab8a41a9b447ee613299d4209bae80653d7f6ae0bac963badc1ee968049f5dbcea0ce4ba27794f4f005840b0841f49a1d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mftinc.sty) \
texlive-mftinc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(chngpage.sty) \
tex(keyval.sty) \
tex(lineno.sty) \
tex(rawfonts.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
