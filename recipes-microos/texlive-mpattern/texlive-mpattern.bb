SUMMARY = "Patterns in MetaPost"
DESCRIPTION = "A package for defining and using patterns in MetaPost, using \
the Pattern Color Space available in PostScript Level 2."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-mpattern-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "1d850d806545a67571e0a8d855db59c3f732bbb43fd3660ab1f1cb64ee66527c8d58db78fae1119f6751d150cec95d992026bad4b90c69be982bd4e38b49b913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpattern"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
