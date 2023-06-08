SUMMARY = "Upper Sorbian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Upper Sorbian in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-uppersorbian-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "6d0bfb66686ec77a46f7b2240953ffbbe2b0fa60f9511ab227ed472028869100a661775a73a593840c48532f1bec0560a94db171405b08868013f9f876dbca89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-hsb.ec.tex) tex(hyph-hsb.tex) tex(loadhyph-hsb.tex) texlive-hyphen-uppersorbian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
