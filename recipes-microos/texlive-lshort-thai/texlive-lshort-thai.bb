SUMMARY = "Introduction to LaTeX in Thai"
DESCRIPTION = "This is the Thai translation of the Short Introduction to \
LaTeX2e."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.32svn55643"

RPM_NAME = "texlive-lshort-thai-2023.201.1.32svn55643-52.1.noarch.rpm"
RPM_HASH = "50755e4bef5e2c719945b40ff594925b94162f3c04cd41a3a6e9903434fa6c384e2f673398d4b5653bb491acc1f8f1d95a8d1af2ace78e19988f8b4240a26baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-thai"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
