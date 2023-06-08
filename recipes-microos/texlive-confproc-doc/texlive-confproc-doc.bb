SUMMARY = "Documentation for texlive-confproc"
DESCRIPTION = "This package includes the documentation for texlive-confproc"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.8svn29349"

RPM_NAME = "texlive-confproc-doc-2023.204.0.0.8svn29349-54.1.noarch.rpm"
RPM_HASH = "3152dcfa5943bdab4ee0fa87649187ed9abf4aaf6d8c6984b651eba5c18b52f461e8db2207cae07ad641268fb1296bdd4a0449e128cc64da9852cf46348514cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-confproc-doc"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl"

inherit rpm
