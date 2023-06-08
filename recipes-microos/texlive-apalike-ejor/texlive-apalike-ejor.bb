SUMMARY = "A BibTeX style file for the European Journal of Operational Research"
DESCRIPTION = "This package contains a BibTeX style file, apalike-ejor.bst, \
made to follow the European Journal of Operational Research \
reference style guidelines. It is a fork of apalike version \
0.99a, by Oren Patashnik, and consists of minor modifications \
of standard APA style. Among other changes it adds support for \
hyperlinked URL and DOI fields (which requires hyperref)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn59667"

RPM_NAME = "texlive-apalike-ejor-2023.201.1.2.0svn59667-54.1.noarch.rpm"
RPM_HASH = "a053d4f5194c69909f524af6d2cec1b202b5131e25e26467af1f816e5a83b07815ac8384cb0f5779b6f8cc45b424adfa93ff58855b32d6a5ea30fb5e60db9ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-ejor"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
