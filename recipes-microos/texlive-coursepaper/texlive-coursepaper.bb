SUMMARY = "Prepare university course papers"
DESCRIPTION = "Coursepaper is a class with which students can provide simple \
course papers, in a uniform design to ease the task of marking."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.0svn15878"

RPM_NAME = "texlive-coursepaper-2023.204.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "8ca7424477f84ceecde12d23f2602fc21ff70ddbc26a0e9a3fde347597ecab3dfac59fd91b3b5b8d4deb821761103e0a48cc516b26b3adde6e094affe98e45aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(coursepaper.cls) texlive-coursepaper"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
