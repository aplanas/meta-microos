SUMMARY = "Handle bit-vector datatype"
DESCRIPTION = "This package defines and implements the data type bit set, a \
vector of bits. The size of the vector may grow dynamically. \
Individual bits can be manipulated."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53837"

RPM_NAME = "texlive-bitset-2023.201.1.3svn53837-52.1.noarch.rpm"
RPM_HASH = "83ab32b5c341f917f27d774430372bb0f75f458deb22a518c1bdc035b37b0353659216bfe5b82e8ab739038427a1d102a02fc921f0e3d5787b3b224fb8b17b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bitset.sty) texlive-bitset"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(bigintcalc.sty) tex(infwarerr.sty) tex(intcalc.sty) texlive texlive-bigintcalc texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
