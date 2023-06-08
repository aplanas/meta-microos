SUMMARY = "Support for Libertinus OpenType"
DESCRIPTION = "This package offers LuaLaTeX/XeLaTeX support for the Libertinus \
OpenType fonts maintained by Khaled Hosny. Missing fonts are \
defined via several font feature settings. The Libertinus fonts \
are similiar to Libertine and Biolinum, but come with math \
symbols."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.29svn60023"

RPM_NAME = "texlive-libertinus-otf-2023.201.0.0.29svn60023-54.1.noarch.rpm"
RPM_HASH = "651c00cee38b83675de27d980e5880200dbc5c52f5ac57ab485489c4300cea286a01ba15861f9606f2a4ac840d7a4c65000a63b835a641291816bd1a37fe2e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(libertinus-otf.sty) texlive-libertinus-otf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontspec.sty) tex(ifluatex.sty) tex(ifxetex.sty) tex(textcomp.sty) tex(unicode-math.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
