SUMMARY = "Turkmen hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Turkmen in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-turkmen-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "3877637ccbdfb9e37e805a7bdd97ae11e669578b4dd5f8a34a94ec060d514827e0ed6af52af53323b1e9dab3698c33f9d183db90bdc205d9b239b3ee2c9b39e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-tk.ec.tex) tex(hyph-tk.tex) tex(loadhyph-tk.tex) texlive-hyphen-turkmen"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
