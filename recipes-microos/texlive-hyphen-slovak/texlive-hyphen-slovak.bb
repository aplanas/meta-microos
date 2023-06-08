SUMMARY = "Slovak hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Slovak in T1/EC and UTF-8 encodings. \
Original patterns 'skhyphen' are still distributed in the \
'csplain' package and loaded with ISO Latin 2 encoding (IL2)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-slovak-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "af70b5021160b8b4ac4a043498b2da42c3c10146b06895f51231eb9b3d9f45deadf8d87b9e1e5639761c0177c6ea65190a1dd2fa696352b2b406aff346c1862e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-sk.ec.tex) tex(hyph-sk.tex) tex(loadhyph-sk.tex) texlive-hyphen-slovak"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
