SUMMARY = "Documentation for texlive-selnolig"
DESCRIPTION = "This package includes the documentation for texlive-selnolig"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.302svn38721"

RPM_NAME = "texlive-selnolig-doc-2023.201.0.0.302svn38721-53.1.noarch.rpm"
RPM_HASH = "54d28880fb1bfb00b64a80680045cf41fe24c753f90874a1999f8b5e62b51376aa27249af9981d1c0919d994bc7069bdcc1be303c12437a4fd68783a40d09cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selnolig-doc"
RDEPENDS:${PN} += ""

inherit rpm
