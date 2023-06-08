SUMMARY = "Typeset Chinese representations of numbers"
DESCRIPTION = "The package provides commands to typeset Chinese \
representations of numbers. The main difference between this \
package and CJKnumb is that the commands provided are \
expandable in the 'proper' way."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn66115"

RPM_NAME = "texlive-zhnumber-2023.201.3.0svn66115-52.1.noarch.rpm"
RPM_HASH = "f80f0ab49d94a2fc05d6c2ef18564b3a2cef8c98d9aeceb7d8fca266cad5c8fd27d2e503fe1d82e40c2fce72be04c9f3cafdd0af1d0656a4ba733b73ee216019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zhnumber-big5.cfg) tex(zhnumber-gbk.cfg) tex(zhnumber-utf8.cfg) tex(zhnumber.sty) texlive-zhnumber"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(l3keys2e.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
