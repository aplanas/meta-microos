SUMMARY = "Church Slavonic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Church Slavonic in UTF-8 encoding"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-churchslavonic-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "82eb70504af1c84b6cf7f36916b32611ca85fe5e40a009505d4096bf6d90e28075d4481db265dd48d2e351cdbe75bb9027ee866d3d5e797713c94e5d127accc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-cu.tex) tex(loadhyph-cu.tex) texlive-hyphen-churchslavonic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
