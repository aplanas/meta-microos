SUMMARY = "Class for the NRC technical journals"
DESCRIPTION = "Macros, and some documentation, for typesetting papers for \
submission to journals published by the National Research \
Council Research Press. At present, only nrc2.cls (for \
two-column layout) should be used."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01asvn29027"

RPM_NAME = "texlive-nrc-2023.201.2.01asvn29027-54.1.noarch.rpm"
RPM_HASH = "4804cebc2ac79d5fb0e8f253db6f042f30478ffc697389310b558e42bd62f2332ca3f497b63c1681a40b8065c4b9203edd8e1295c6d05774ff792a57d06ecf95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nrc1.cls) tex(nrc1.sty) tex(nrc2.cls) tex(nrc2.sty) texlive-nrc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(fontenc.sty) tex(multicol.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
