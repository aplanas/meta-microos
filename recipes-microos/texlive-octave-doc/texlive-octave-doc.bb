SUMMARY = "Documentation for texlive-octave"
DESCRIPTION = "This package includes the documentation for texlive-octave"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-octave-doc-2023.201.svn66115-54.1.noarch.rpm"
RPM_HASH = "739ec23dc3964e9d3f05dac51b72650d5f5d723432810f724ea14e8663eb619f2a8b2cd050718d04dfa956d084915cdd5e0693c72164693893a4cdb73c58ad0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-octave-doc"
RDEPENDS:${PN} += ""

inherit rpm
