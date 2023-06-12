SUMMARY = "Southeast University Machine Learning Assignment template"
DESCRIPTION = "This is a template for the Southeast University Machine \
Learning Assignment that can be easily adapted to other usages. \
This template features a colorful theme that makes it look \
elegant and attractive. You can also find the template \
available on Overleaf."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn62933"

RPM_NAME = "texlive-seu-ml-assign-2023.201.1.1svn62933-53.1.noarch.rpm"
RPM_HASH = "e109a5289aa1d5a052aeab5fee77204fa22dbe62deb4faee4cb0082ea16c5c70f618d7dbeeed76c4dbf4c2827fcb6090f5517fe4ce90d6a587edb7a7226e2cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(seu-ml-assign.cls) \
texlive-seu-ml-assign"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(afterpage.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(article.cls) \
tex(bm.sty) \
tex(caption.sty) \
tex(fancyhdr.sty) \
tex(fontenc.sty) \
tex(footmisc.sty) \
tex(geometry.sty) \
tex(hyperref.sty) \
tex(listings.sty) \
tex(mathtools.sty) \
tex(nicematrix.sty) \
tex(suffix.sty) \
tex(tabularx.sty) \
tex(tcolorbox.sty) \
tex(tikz.sty) \
tex(titlesec.sty) \
tex(varwidth.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
