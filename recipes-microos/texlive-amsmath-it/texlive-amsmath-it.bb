SUMMARY = "Italian translations of some old amsmath documents"
DESCRIPTION = "The documents are: diffs-m.txt of December 1999, and \
amsmath.faq of March 2000."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22930"

RPM_NAME = "texlive-amsmath-it-2023.201.svn22930-54.1.noarch.rpm"
RPM_HASH = "60ec4ab81cd8a7915884c429e316c97f4ef7cf29e019a0e341a90a805650d478ff25fee5971ba49ed6ae1f22cd45d338cee23a1d8bbe26f6665c4df60ba55d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsmath-it"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
