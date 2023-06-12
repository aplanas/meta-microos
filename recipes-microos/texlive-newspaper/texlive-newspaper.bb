SUMMARY = "Typeset newsletters to resemble newspapers"
DESCRIPTION = "The newspaper package redefines the page style and \\maketitle \
command to produce a typeset page similar to that of a \
newspaper. It also provides several commands that (when used \
with other packages) simplify the writing of articles in a \
newspaper-style column format."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-newspaper-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "b9e0ceeb95c1e99a2c492b6a23edbeffcc8a248b37de75a415df30ebbd4f2875ac86c8f80bb53511401b2ab8cfb087e04d0616255a465e5b9a0244cbf16a4366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(newspaper.sty) \
texlive-newspaper"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(yfonts.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
