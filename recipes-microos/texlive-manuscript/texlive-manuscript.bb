SUMMARY = "Emulate look of a document typed on a typewriter"
DESCRIPTION = "This package is designed for those who have to submit \
dissertations, etc., to institutions that still maintain the \
typewriter is the summit of non-professional printing."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn36110"

RPM_NAME = "texlive-manuscript-2023.201.1.7svn36110-52.1.noarch.rpm"
RPM_HASH = "afca07079309a48ca3d10b71a19e73b56ea031c401fe0cbf3f6c4afd5c4462c0363456a8e449ebb9a9f92bb12d5839e837d01f54f3c2a59823a7484599a8f6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(manuscript.sty) texlive-manuscript"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontenc.sty) tex(fullpage.sty) tex(ragged2e.sty) tex(setspace.sty) tex(soul.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
