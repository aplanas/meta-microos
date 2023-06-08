SUMMARY = "Bibliography styles for German texts"
DESCRIPTION = "A set of bibliography styles that conformt to DIN 1505, and \
match the original BibTeX standard set (plain, unsrt, alpha and \
abbrv), together with a style natdin to work with natbib."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19441"

RPM_NAME = "texlive-din1505-2023.201.svn19441-52.1.noarch.rpm"
RPM_HASH = "2f3f789cc50b4d632f74380d1f51e31ea4758ae5370d5a74f1a08f46479d748de16cb9764cd8c08c249fbaecdacc30e502a0c0e6c268582716528ac74af1d5d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-din1505"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
