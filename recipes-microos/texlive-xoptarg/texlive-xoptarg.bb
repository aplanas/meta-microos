SUMMARY = "Expandable macros that take an optional argument"
DESCRIPTION = "Commands that take an optional argument are not ordinarily \
expandable; this package allows such commands to be expandable \
provided that they have at least one mandatory argument."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-xoptarg-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "64598ab5f055a2a1a9b1200a81363a08d7ff49c99d8d8c47c9e51b0223bc7ccf47f74ace6a6b35906e72ee89c2b95c67f06ca7ab8bb6cf5fab18aabefcfa7605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xoptarg.sty) texlive-xoptarg"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
