SUMMARY = "Tools for drawing graphs of functions"
DESCRIPTION = "The tkz-fct package is designed to give math teachers (and \
students) easy access to programming graphs of functions with \
TikZ and gnuplot."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7csvn61949"

RPM_NAME = "texlive-tkz-fct-2023.201.1.7csvn61949-52.1.noarch.rpm"
RPM_HASH = "aa2e9b59cf554cc7487046d271c95f2646910a4649ac663a29d3074fd75cc20424c621d553db440340de6af0a4221e893b144add2544d5794909c9a07a80b620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tkz-fct.sty) \
texlive-tkz-fct"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fp.sty) \
tex(tkz-base.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
