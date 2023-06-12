SUMMARY = "Pretty-print token lists"
DESCRIPTION = "Pretty-print token lists to HTML file for debugging purposes. \
Open the file in any browser to view the result. Can be used to \
replace \\tl_analysis_show:n."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1svn63842"

RPM_NAME = "texlive-prettytok-2023.201.0.0.0.1svn63842-52.1.noarch.rpm"
RPM_HASH = "b56dfabe2efe7dff8d58082e930aad5f1d437ed247a61b6e945a24055435ed0a9700ab0a55cf44f78d5f68b363d69669bb72a10febdf071c2d1395dfbbf987c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(prettytok.sty) \
texlive-prettytok"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(precattl.sty) \
texlive \
texlive-filecontentsdef \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-precattl \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
