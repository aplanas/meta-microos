SUMMARY = "Pass verbatim contents through a compiler and reincorporate the resulting output"
DESCRIPTION = "This package augments the fancyvrb and listings packages to \
allow the source code they contain to be checked by an external \
tool (like a compiler). The external tool's messages can be \
automatically reincorporated into the original document. The \
package does not focus on a specific programming language, but \
it is designed to work well with languages and compilers in the \
ML family."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn38300"

RPM_NAME = "texlive-checklistings-2023.201.1.0svn38300-53.1.noarch.rpm"
RPM_HASH = "14fbf98d463875cbf01efa58f16b078dd71155107495920b79ae31a2e0df93e55a5673f77d8d76f6cd5adf90f4e9fd3e432d018040c72440f55cdf8b22f2b4ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(checklistings.sty) \
texlive-checklistings"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(fancyvrb.sty) \
tex(keyval.sty) \
tex(kvoptions.sty) \
tex(listings.sty) \
texlive \
texlive-checklistings-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
