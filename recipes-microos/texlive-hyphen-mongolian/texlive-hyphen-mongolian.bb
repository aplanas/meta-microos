SUMMARY = "Mongolian hyphenation patterns in Cyrillic script"
DESCRIPTION = "Hyphenation patterns for Mongolian in T2A, LMC and UTF-8 \
encodings. LMC encoding is used in MonTeX. The package includes \
two sets of patterns that will hopefully be merged in future."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-mongolian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "20b9b67a766a8579c40da1aedd9c2b28a2b8e7d6fddb43b7e60255ac483b020088e26833d0a2095c0f6ef6cf76255b6f173ab1696ad1b86cd6f755d63bb72e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-mn-cyrl-x-lmc.lmc.tex) tex(hyph-mn-cyrl-x-lmc.tex) tex(hyph-mn-cyrl.t2a.tex) tex(hyph-mn-cyrl.tex) tex(loadhyph-mn-cyrl-x-lmc.tex) tex(loadhyph-mn-cyrl.tex) texlive-hyphen-mongolian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
