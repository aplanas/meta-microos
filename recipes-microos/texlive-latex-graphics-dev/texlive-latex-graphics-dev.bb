SUMMARY = "Development pre-release of the LaTeX graphics bundle"
DESCRIPTION = "This is a pre-release version of the standard LaTeX graphics \
bundle. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2023.201.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-graphics-dev-2023.201.20230501_pre_release_0svn64899-55.1.noarch.rpm"
RPM_HASH = "d8df398e738dc8c6cc431c552edd3ff8573dea05377285e845249849c57c7d829faf6ea2c2323436cabf167e92d4dbe91edf1ab2b12c055d8332ad743d2f6f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev(color.sty) \
texdev(dvipdf.def) \
texdev(dvipsnam.def) \
texdev(dvipsone.def) \
texdev(dviwin.def) \
texdev(emtex.def) \
texdev(epsfig.sty) \
texdev(graphics-2017-06-25.sty) \
texdev(graphics.sty) \
texdev(graphicx.sty) \
texdev(keyval.sty) \
texdev(lscape.sty) \
texdev(pctex32.def) \
texdev(pctexhp.def) \
texdev(pctexps.def) \
texdev(pctexwin.def) \
texdev(rotating.sty) \
texdev(tcidvi.def) \
texdev(trig.sty) \
texdev(truetex.def) \
texlive-latex-graphics-dev"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texdev(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-graphics-cfg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
