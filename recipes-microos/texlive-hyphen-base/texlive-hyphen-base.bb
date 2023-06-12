SUMMARY = "Core hyphenation support files"
DESCRIPTION = "Includes Knuth's original hyphen.tex, zerohyph.tex to disable \
hyphenation, language.us which starts the autogenerated files \
language.dat and language.def (and default versions of those), \
etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66413"

RPM_NAME = "texlive-hyphen-base-2023.201.svn66413-52.1.noarch.rpm"
RPM_HASH = "aaa61881eb740ac42505afc0bada0dbdc7b862348a2952f676f93e1d7cb590c603f87925aef7750a44e504584509b1227fb217aeb642dc81f3b919ea1fcdd5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-hyphen-base) \
tex(dumyhyph.tex) \
tex(hyphen.tex) \
tex(hypht1.tex) \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
tex(language.us.def) \
tex(zerohyph.tex) \
texlive-hyphen-base"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
