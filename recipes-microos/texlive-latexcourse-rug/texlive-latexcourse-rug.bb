SUMMARY = "A LaTeX course book"
DESCRIPTION = "The package provides the book and practice files for a LaTeX \
course that the author has give several times at the \
Rijksuniversiteit Groningen (Netherlands)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn39026"

RPM_NAME = "texlive-latexcourse-rug-2023.201.1.1svn39026-54.1.noarch.rpm"
RPM_HASH = "26834c71c31fac739a06488586c85589efdcae1afefea72753ba84de36e5318dadc63aa9af4a365f7e329a37c7605fa5bb909485d34ca2bc52fb1204c9449ca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcourse-rug"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
