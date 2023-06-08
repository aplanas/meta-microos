SUMMARY = "Typeset go diagrams with PSTricks"
DESCRIPTION = "The psgo package"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.17svn15878"

RPM_NAME = "texlive-psgo-2023.201.0.0.17svn15878-52.1.noarch.rpm"
RPM_HASH = "6e9914af141421fb3f3bbd0870835f5baa0db2de2e55d83a1522afc22225b51ec46f44420e92ee6e7ca86109a26823502264d313de7256f7ed19c8a39c7571f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(psgo.sty) texlive-psgo"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(ifthen.sty) tex(pst-node.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
