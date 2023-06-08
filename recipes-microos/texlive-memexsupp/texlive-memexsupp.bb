SUMMARY = "Experimental memoir support"
DESCRIPTION = "A package of code proposed as supporting material for memoir. \
The package is intended as a test bed for such code, which may \
in the fullness of time be adopted into the main memoir \
release."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-memexsupp-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "604a080ec886c5a343da20577148524d5f56ca7affc77bfdf8dfdafe07c80fc4ab57d87d2915609a2f54ab36edab796e38d95525afce343346a25fc325d3ef16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(memexsupp.sty) texlive-memexsupp"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
