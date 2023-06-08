SUMMARY = "Track the number of subsections etc. that occur in a specified tracklevel"
DESCRIPTION = "This package is the successor of cntperchap and allows to \
provide more tracklevels than just only one."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-2023.201.0.0.5svn54080-52.1.noarch.rpm"
RPM_HASH = "dd5c92acfa93618c69a32880a9b15f91bd53e10a34a194735163715d867b0b6bd6b642c1553ac36c104b1534fb9e911bfc28dd35d958188e6c0227277a2115d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xcntperchap.sty) texlive-xcntperchap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(l3keys2e.sty) tex(xassoccnt.sty) tex(xparse.sty) tex(zref.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
