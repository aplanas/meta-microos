SUMMARY = "Array data structures for (La)TeX"
DESCRIPTION = "This package provides array data structures in (La)TeX, in the \
meaning of the classical procedural programming languages like \
Fortran, Ada or C, and macros to manipulate them. Arrays can be \
mono or bi-dimensional. This is useful for applications which \
require high level programming techniques, like algorithmic \
graphics programmed in the TeX language. The package supersedes \
the arrayjob package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn18125"

RPM_NAME = "texlive-arrayjobx-2023.201.1.04svn18125-53.1.noarch.rpm"
RPM_HASH = "af4aca459ea8eac51aea4708d0a466ba6a67e33ab8dd681fdc262e8eb27a531b861e5801222235cf8b32000cc796e1e695cbeff44a23537da282dea4c4fc126c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arrayjob.sty) tex(arrayjobx.sty) texlive-arrayjobx"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
