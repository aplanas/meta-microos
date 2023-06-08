SUMMARY = "Letters and faxes in French"
DESCRIPTION = "Developed from the ancestor of the standard letter class, at \
the Observatoire de Geneve."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.002svn54722"

RPM_NAME = "texlive-lettre-2023.201.3.002svn54722-54.1.noarch.rpm"
RPM_HASH = "e13dd7ea888f860d83a50ac6e4db4a61a4eb19e31b765b829a2d84719c4d759d5069a621a274e250c77f0fe276fbb51fc52b4847a753de4f0cc71421df44660d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lettre-USenglish.ldf) tex(lettre-amg.cfg) tex(lettre-default.cfg) tex(lettre-english.ldf) tex(lettre-french.ldf) tex(lettre-german.ldf) tex(lettre-obs.cfg) tex(lettre-romand.ldf) tex(lettre.cls) texlive-lettre"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(graphicx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
