SUMMARY = "Danish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Danish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-danish-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "b5ed2ee16381909afbb4840f010a5dc41678fc1251b17d77a5d770192f2d4f6ab4010d754cfdb9aef3178855c04d30b0a4d7e53a6180a5f13833e4b26cad0f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-da.ec.tex) tex(hyph-da.tex) tex(loadhyph-da.tex) texlive-hyphen-danish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
