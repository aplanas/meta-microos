SUMMARY = "Add a Navigation Path to the page header"
DESCRIPTION = "This package adds a navigation path ('breadcrumb trail') at the \
header of a presentation, just like some websites do in order \
to simplify navigation."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.4.1svn64602"

RPM_NAME = "texlive-crumbs-2023.204.0.0.4.1svn64602-54.1.noarch.rpm"
RPM_HASH = "5635b25f9d9af7ac49075bbbaf914e5f6662cdeaa5ab46b7ea04d457908c3aac05a934e5d82d2cefdbb94a11a02f8a75e507d6f163dfb3806db4d7fd1a998372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(crumbs.sty) texlive-crumbs"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(catchfile.sty) tex(etoolbox.sty) tex(xkeyval.sty) texlive texlive-catchfile texlive-etoolbox texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-xkeyval"

inherit rpm
