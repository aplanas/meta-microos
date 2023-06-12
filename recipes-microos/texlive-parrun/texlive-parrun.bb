SUMMARY = "Typesets (two) streams of text running parallel"
DESCRIPTION = "For typesetting translated text and the original source, \
parallel on the same page, one above the other."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-parrun-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "37eaec7e9703f688b6283170237f6e2d77838fa6e27424fee07058c068a00fb3fbb32bfb1b108dd5e1d4cfa32cb75ddc527d36e404af36e01512bdbc688e7e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(parrun.sty) \
texlive-parrun"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
