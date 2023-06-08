SUMMARY = "Introduction to LaTeX in Italian"
DESCRIPTION = "This is the Italian translation of the Short Introduction to \
LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.2svn57038"

RPM_NAME = "texlive-lshort-italian-2023.201.6.2svn57038-54.1.noarch.rpm"
RPM_HASH = "7deaedfafcdd82cd0df820652edc4f182198a950315dedc7424b45113e835d15239478514a0b1e80c31e424e94786275315adbba36791b75d45a3dbaf049272a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-italian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
