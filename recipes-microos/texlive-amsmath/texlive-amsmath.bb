SUMMARY = "AMS mathematical facilities for LaTeX"
DESCRIPTION = "The package provides the principal packages in the AMS-LaTeX \
distribution. It adapts for use in LaTeX most of the \
mathematical features found in AMS-TeX; it is highly \
recommended as an adjunct to serious mathematical typesetting \
in LaTeX. When amsmath is loaded, AMS-LaTeX packages amsbsy \
(for bold symbols), amsopn (for operator names) and amstext \
(for text embedded in mathematics) are also loaded. amsmath is \
part of the LaTeX required distribution; however, several \
contributed packages add still further to its appeal; examples \
are empheq, which provides functions for decorating and \
highlighting mathematics, and ntheorem, for specifying theorem \
(and similar) definitions."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63514"

RPM_NAME = "texlive-amsmath-2023.201.svn63514-54.1.noarch.rpm"
RPM_HASH = "7dc36bc46f1f9648c843bf803a2362e04c0797c656cc02f0a1fa1745785862fdf8c194f7ae50485a07b7988a8af4b9105201f94b2c3d22d931ccbaa95c7df29d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(amsbsy.sty) \
tex(amscd.sty) \
tex(amsgen.sty) \
tex(amsmath-2018-12-01.sty) \
tex(amsmath.sty) \
tex(amsopn.sty) \
tex(amstex.sty) \
tex(amstext.sty) \
tex(amsxtra.sty) \
texlive-amsmath"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
