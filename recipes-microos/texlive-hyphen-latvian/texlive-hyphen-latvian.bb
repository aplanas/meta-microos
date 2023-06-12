SUMMARY = "Latvian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Latvian in L7X and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-latvian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "6524f710b338f99a2e5f5f3091eb8395aa7e109bd4d22775018bf2bffd5904bf6002a6fe8ce73f508a389a4193f7d3970c9561b31149ead158c9bd77ecf71b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-lv.l7x.tex) \
tex(hyph-lv.tex) \
tex(loadhyph-lv.tex) \
texlive-hyphen-latvian"
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
