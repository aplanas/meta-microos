SUMMARY = "LaTeX class for formatting academic papers in ABNT standards"
DESCRIPTION = "This is a LaTeX class created for Brazilian students to \
facilitate the use of standards from the Associacao Brasileira \
de Normas Tecnicas (ABNT) in academic works like TCCs, \
dissertations, theses."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.0.0_alphasvn65705"

RPM_NAME = "texlive-abntexto-2023.201.2.0.0_alphasvn65705-54.1.noarch.rpm"
RPM_HASH = "50f211c011e0ac5a72cc19ee9770c3bb6da23c42ac30865001028c7396bd512a6fbd7cbf80e6f8ccc31d967b987a06093a47600539fadd948a4762fde14ee269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(abntexto.cls) texlive-abntexto"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
