SUMMARY = "Introduction to LaTeX in Polish"
DESCRIPTION = "This is the Polish translation of A Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.4pl1svn63289"

RPM_NAME = "texlive-lshort-polish-2023.201.6.4pl1svn63289-54.1.noarch.rpm"
RPM_HASH = "16accbd96c2d8da852a4610ce0d9c0018566d1474714e1cf80f7475a37bb3198120cf283b191bfac389f69fc1ee3cb7fb67da99967fc45649c10d35430ba92fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-polish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
