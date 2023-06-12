SUMMARY = "Document class and bibliographic style for French law"
DESCRIPTION = "The bundle provides a toolkit intended for students writing a \
thesis in French law. It features: a LaTeX document class; a \
bibliographic style for BibLaTeX package; a practical example \
of french thesis document; and documentation. The class assumes \
use of biber and BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn39802"

RPM_NAME = "texlive-droit-fr-2023.201.1.2svn39802-52.1.noarch.rpm"
RPM_HASH = "df4569e5c34df3c7b7d114ceb96dc563ca6db667966c1d4f4b41dbba343a7f5918c98fced29c3027b20a185eef435ea988b20cbb397ac24bfbb4d06e4befea77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(droit-fr.bbx) \
tex(droit-fr.cbx) \
tex(droit-fr.cls) \
texlive-droit-fr"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(csquotes.sty) \
tex(engrec.sty) \
tex(filecontents.sty) \
tex(footmisc.sty) \
tex(ifdraft.sty) \
tex(ifluatex.sty) \
tex(inputenc.sty) \
tex(kvoptions.sty) \
tex(refcount.sty) \
tex(verbose-ibid.bbx) \
tex(verbose-ibid.cbx) \
tex(xifthen.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
