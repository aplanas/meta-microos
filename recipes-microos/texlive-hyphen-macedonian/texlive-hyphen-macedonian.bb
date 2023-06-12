SUMMARY = "Macedonian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Macedonian"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-macedonian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "c0c19ecf8fe3b4aea52ff2807e65d8e2900b74de97e3669d590abce498ec7e6ea31cedf7fa8e28883c4360129e6be9e2cf14e2ad38d93566f9b8d0f6e0e5f6d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-mk.macedonian.tex) \
tex(hyph-mk.tex) \
tex(loadhyph-mk.tex) \
texlive-hyphen-macedonian"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
