SUMMARY = "MetaPost module with different types of arrow heads"
DESCRIPTION = "A package to provide different types of arrow heads to be used \
with MetaPost commands drawarrow and drawdblarrow commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.1svn39729"

RPM_NAME = "texlive-mparrows-2023.201.0.0.1svn39729-54.1.noarch.rpm"
RPM_HASH = "45d3fa0d0d1d68d03c038c0637746f3f9fe833027afd81dfddde32e5bebd0dfaaea002898858aaed73ebb148f9f89414e2fbfd2d85c5791ce6c729c234f07457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparrows"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
