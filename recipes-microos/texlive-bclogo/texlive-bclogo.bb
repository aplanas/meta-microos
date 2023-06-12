SUMMARY = "Creating colourful boxes with logos"
DESCRIPTION = "The package facilitates the creation of colorful boxes with a \
title and logo. It may use either tikz or PSTricks as graphics \
engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn39364"

RPM_NAME = "texlive-bclogo-2023.201.3.1svn39364-53.1.noarch.rpm"
RPM_HASH = "b72073b810208a6c2d616ebbf26f71d6dcc056d70923fe17b0bcd235f921ec637f3efd367b29bdc406c050f60ab7830958d68ac8c41023d7d4463d83942ca992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bclogo.sty) \
texlive-bclogo"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(graphicx.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(mdframed.sty) \
tex(pst-blur.sty) \
tex(pst-coil.sty) \
tex(pst-grad.sty) \
tex(pstricks.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
