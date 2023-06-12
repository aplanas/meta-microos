SUMMARY = "Generate a font book"
DESCRIPTION = "The package provides a means of producing a 'book' of font \
samples (for evaluation, etc.)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn23608"

RPM_NAME = "texlive-fontbook-2023.201.0.0.2svn23608-52.1.noarch.rpm"
RPM_HASH = "0a9f97bfc7c38cf012587efc42c2c7993d0114a729c8a0b3cb8bc00a0898e8a6a66df955631bb4860404883735762088231cd579aec94e72168a836ed81f1b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fontbook.sty) \
texlive-fontbook"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fontspec.sty) \
tex(kvoptions.sty) \
tex(xunicode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
