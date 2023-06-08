SUMMARY = "Map and iterate over LaTeX3 clists"
DESCRIPTION = "This package provides a key-based interface for defining \
templates whose job is to partition LaTeX3 clists and map \
differentiatedly across its components."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61811"

RPM_NAME = "texlive-clistmap-2023.201.1.2svn61811-53.1.noarch.rpm"
RPM_HASH = "20724db8a138b629cb89d3e050e1b48b9e4c8de4897fd79fe367ac19e5a7f62808bf9bccfaa25adaeb4d60b57e4f32b1045b8ca31ed175744d1e288d3b4d3c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(clistmap.sty) texlive-clistmap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(erw-l3.sty) tex(l3keys2e.sty) tex(xparse.sty) tex(xtemplate.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
