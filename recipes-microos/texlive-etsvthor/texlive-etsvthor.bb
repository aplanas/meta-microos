SUMMARY = "Some useful abbreviations for members of e.t.s.v. Thor"
DESCRIPTION = "'e.t.s.v. Thor' stands for 'Elektrotechnische Studievereniging \
Thor', a study association of Electrical Engeering at the \
Eindhoven University of Technology. The author of the package \
tells us: 'Most of our committees use LaTeX to create meeting \
notes or other formal documents within the association. When \
you create a lot of these documents (which I do a lot, since I \
am currently the candidate Secretary of the new board), some \
abbreviations are extremely useful. I discovered that more \
people from our association are interested in using these, so I \
decided to put them in a package, so they can use it very \
easily too.'"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48186"

RPM_NAME = "texlive-etsvthor-2023.201.1.0svn48186-52.1.noarch.rpm"
RPM_HASH = "75f22d398ef31f89a52843089dc16f9ee60223faba4791a6e2ec1d8e1c580d66df11656dea024ae16f74a0447855f74c414f85d80cce1b4dbaf793ae0e2401bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(etsvthor.sty) texlive-etsvthor"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(epsfig.sty) tex(graphicx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
