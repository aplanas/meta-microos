SUMMARY = "Typesetting academic documents from the University of Caxias do Sul"
DESCRIPTION = "This is a LaTeX class for typesetting academic documents \
according to the ABNT (Brazilian Technical Standards \
Association) standards and the UCS (University of Caxias do \
Sul) specifications."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.0svn52698"

RPM_NAME = "texlive-ucsmonograph-2023.201.1.3.0svn52698-53.1.noarch.rpm"
RPM_HASH = "d39b59797c4ce7a55bd8b56381973646326d449614e76ac0c23a7f7492acd97829d3866a8a0443ab6ce778f530b27151014f19d5bb88e3c8fda46091a566d557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ucsmonograph.cls) texlive-ucsmonograph"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(abntex2.cls) tex(adjustbox.sty) tex(amsmath.sty) tex(calc.sty) tex(caption.sty) tex(chngcntr.sty) tex(cite.sty) tex(etoolbox.sty) tex(float.sty) tex(geometry.sty) tex(glossaries-extra.sty) tex(graphicx.sty) tex(icomma.sty) tex(ifluatex.sty) tex(ifthen.sty) tex(indentfirst.sty) tex(kvoptions.sty) tex(lmodern.sty) tex(suffix.sty) tex(textpos.sty) tex(unicode-math.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
