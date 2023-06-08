SUMMARY = "Documentation and extraction for packages and document classes"
DESCRIPTION = "The class provides the functionality and implementation of \
packages and document classes. It is loosely based on the ydoc \
and ltxdoc classes, but has a number of incompatible \
differences. The class defines a MacroCode environment which \
offers an alternative to the usual docstrip method of \
installing packages. It has the ability to generate both \
documentation and code in a single run of a single file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5dsvn56950"

RPM_NAME = "texlive-skdoc-2023.201.1.5dsvn56950-57.1.noarch.rpm"
RPM_HASH = "770eb06094626df8e49db34c86e8f7891aa901a6eb44f78e0fd2a3ba5eae2a8e958fcc357a8541ffeb52c46b11a507e3d17509ed984672e703bc90cb8a670f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(skdoc.cls) texlive-skdoc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(PTSerif.sty) tex(atbegshi.sty) tex(babel.sty) tex(calc.sty) tex(caption.sty) tex(csquotes.sty) tex(etoolbox.sty) tex(everyhook.sty) tex(expl3.sty) tex(hologo.sty) tex(hyperref.sty) tex(kvoptions.sty) tex(marginnote.sty) tex(microtype.sty) tex(minted.sty) tex(multicol.sty) tex(needspace.sty) tex(opensans.sty) tex(pdftexcmds.sty) tex(scrlayer-scrpage.sty) tex(sourcecodepro.sty) tex(verbatim.sty) tex(xparse.sty) tex(xstring.sty) tex(ydoc-code.sty) tex(ydoc-desc.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
