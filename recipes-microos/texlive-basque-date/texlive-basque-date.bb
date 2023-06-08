SUMMARY = "Print the date in Basque"
DESCRIPTION = "The package provides two LaTeX commands to print the current \
date in Basque according to the correct forms ruled by The \
Basque Language Academy (Euskaltzaindia). The commands \
automatically solve the complex declination issues of numbers \
in Basque."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn26477"

RPM_NAME = "texlive-basque-date-2023.201.1.05svn26477-53.1.noarch.rpm"
RPM_HASH = "ad243f727abcec3000babc7158c19d8ccd57e349c73d40d20507138e2240449a3f345bc4f78d89a08b223e8924bbb22155a086ca1cb2f01722c50c505aa3ddae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(basque-date.sty) texlive-basque-date"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
