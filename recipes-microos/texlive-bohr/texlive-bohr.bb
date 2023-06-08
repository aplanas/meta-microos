SUMMARY = "Simple atom representation according to the Bohr model"
DESCRIPTION = "The package provides means for the creation of simple Bohr \
models of atoms up to the atomic number 112. In addition, \
commands are provided to convert atomic numbers to element \
symbols or element names and vice versa."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62977"

RPM_NAME = "texlive-bohr-2023.201.1.0svn62977-52.1.noarch.rpm"
RPM_HASH = "9072ef1f48cf02c6d9f62ea7aeb099137833af0d731f15223ea697534ca46d79ec888afbaf95116c0dcdb7037dfc12de997c7122d4984d1b0e545d99edfc6d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bohr.sty) texlive-bohr"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(elements.sty) tex(pgfopts.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
