SUMMARY = "Right to left presentation with beamer and babel"
DESCRIPTION = "This class provides patches of some beamer templates and \
commands for presentation from right to left. It requires Babel \
with the LuaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn65725"

RPM_NAME = "texlive-beamer-rl-2023.201.1.8svn65725-53.1.noarch.rpm"
RPM_HASH = "cefa02471c273e6854bc01648b3b29563935d788b773dad636364c0edc45d8106580347cb83410c5dfbbde94cfb92a84b1ead018890f39ec030b3cc888b531b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamer-rl.cls) tex(pgfpages-rl.sty) texlive-beamer-rl"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(babel.sty) tex(beamer.cls) tex(ifluatex.sty) tex(pgfpages.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
