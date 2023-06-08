SUMMARY = "Documentation for the libxfce4ui Library"
DESCRIPTION = "This package provides the documentation for the libxfce4ui library."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.3"

RPM_NAME = "libxfce4ui-doc-4.18.3-1.1.noarch.rpm"
RPM_HASH = "7da51d61741bfe7c51a357884a552ee2e5de2d0a4efcac04c12010fedad59ff773942fc3524f0206a1487c382486414abf904e522fb6dba1bcad600246bdd030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxfce4ui-doc"
RDEPENDS:${PN} += ""

inherit rpm
