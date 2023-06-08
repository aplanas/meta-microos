SUMMARY = "Define macros with sophisticated options"
DESCRIPTION = "The package provides a means of defining macros whose options \
are taken from a dictionary, which includes options which \
themselves have arguments. The package was designed for use \
with Plain TeX; its syntax derives from that of the \\hbox, \
\\hrule, etc., TeX primitives."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn23567"

RPM_NAME = "texlive-getoptk-2023.201.1.0svn23567-52.1.noarch.rpm"
RPM_HASH = "70b3e4e1c4a32b9ec7310c3cbe32583097526a3b2e07719933f7b8ff2a8ab5726de099481aa99a9ac5fae8f36280802dea36ac5fc9978719c69c15340f082dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(getoptk.tex) tex(guide.tex) texlive-getoptk"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
