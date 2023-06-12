SUMMARY = "Using graphics from PAW"
DESCRIPTION = "Support for the easy inclusion of graphics made by PAW (Physics \
Analysis Workstation). You need to have PAW installed on your \
system to benefit from this package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn21629"

RPM_NAME = "texlive-pawpict-2023.201.1.0svn21629-51.1.noarch.rpm"
RPM_HASH = "11ec3ab7b6f8e4a912844d4cc367428071c9848df6e1566f76b394fb02363a28e1bce9425fc9696d39885211778e1b21324d3cc39022351d0d813c8b27017710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pawpict.sty) \
texlive-pawpict"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
