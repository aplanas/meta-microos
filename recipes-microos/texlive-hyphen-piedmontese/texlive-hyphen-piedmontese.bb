SUMMARY = "Piedmontese hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Piedmontese in ASCII encoding. \
Compliant with 'Gramatica dla lengua piemonteisa' by Camillo \
Brero."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-piedmontese-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "54e43a9e5922ce3a49a676b447374b3be078ccf250083bd3f85b3608f274aba3b175bd6151d5222da928d63a5ff9ecad826465222ce2dc9421394d4273c5c726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-pms.tex) tex(hyph-quote-pms.tex) tex(loadhyph-pms.tex) texlive-hyphen-piedmontese"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
