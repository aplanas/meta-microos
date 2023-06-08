SUMMARY = "Slovenian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Slovenian in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-slovenian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "e29c9f3b45ddfa65a6befed91685559007c6415304f04b549bfac3feaa82b85c9bae06e2162e6410d4d6f3409d9596abc24fe2eebdd9e54ee5c278a42430cc8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-sl.ec.tex) tex(hyph-sl.tex) tex(loadhyph-sl.tex) texlive-hyphen-slovenian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
