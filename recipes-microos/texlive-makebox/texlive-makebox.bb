SUMMARY = "Defines a \\makebox* command"
DESCRIPTION = "Define a \\makebox* command that does the same as a \\makebox \
command, except that the width is given by a sample text \
instead of an explicit length measure."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-makebox-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "086a6e6ee132e4a4edff805494901dd868727297f96217cb49d8a628739934a625d94c591bb0c1ac0038801b525e2592b5b22837ad84e1558f88e6ec1e2a4494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(makebox.sty) texlive-makebox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
