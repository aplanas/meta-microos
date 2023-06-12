SUMMARY = "Lithuanian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Lithuanian in L7X and UTF-8 encodings. \
\\lefthyphenmin and \\righthyphenmin have to be at least 2."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-lithuanian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "11b6deac8c8586ead312880d5293b3dfcad89379ebbe7f93170a31a8f3e18dd9bdb6cd22b5121cfda965c8f5da6647b69725e719a1fd79fab28bcd275db8c8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-lt.l7x.tex) \
tex(hyph-lt.tex) \
tex(loadhyph-lt.tex) \
texlive-hyphen-lithuanian"
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
