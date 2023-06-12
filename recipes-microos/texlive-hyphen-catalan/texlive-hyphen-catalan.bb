SUMMARY = "Catalan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Catalan in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-catalan-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "3e1c2ad147f36cede911573af3356c1c4afa46777f21d526a744501557080170ded94bbfc3ca210a27e272da1482469f11438d72da9b7648e597b774e4582a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-ca.ec.tex) \
tex(hyph-ca.tex) \
tex(loadhyph-ca.tex) \
texlive-hyphen-catalan"
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
