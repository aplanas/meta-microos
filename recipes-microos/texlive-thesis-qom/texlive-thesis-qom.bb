SUMMARY = "Thesis style of the University of Qom, Iran"
DESCRIPTION = "This package provides a class file for writing theses and \
dissertations according to the University of Qom Graduate \
Schools's guidelines for the electronic submission of master \
theses and PhD dissertations. The class should meet all the \
current requirements and is updated whenever the university \
guidelines change. The class needs XeLaTeX in conjunction with \
the following fonts: XB Niloofar, IranNastaliq, IRlotus, XB \
Zar, XB Titre, and Yas."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn63524"

RPM_NAME = "texlive-thesis-qom-2023.201.0.0.5svn63524-54.1.noarch.rpm"
RPM_HASH = "a25cfad10f9b10079c1ef5e7d3927e60e40ef63113cd852dfb6dc1d24aae31c79cf0cf7c34072ac8601dfe39b656897c4a143b667bf89793eaf2423d94df6cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thesis-qom.cls) \
texlive-thesis-qom"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(apptools.sty) \
tex(array.sty) \
tex(bidi-atbegshi.sty) \
tex(biditools.sty) \
tex(book.cls) \
tex(booktabs.sty) \
tex(emptypage.sty) \
tex(enumitem.sty) \
tex(fancyhdr.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(keyval.sty) \
tex(makeidx.sty) \
tex(multicol.sty) \
tex(picture.sty) \
tex(setspace.sty) \
tex(tikz.sty) \
tex(tocbibind.sty) \
tex(tocloft.sty) \
tex(xcolor.sty) \
tex(xepersian.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
