SUMMARY = "Documentation for texlive-llncs"
DESCRIPTION = "This package includes the documentation for texlive-llncs"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.22svn64299"

RPM_NAME = "texlive-llncs-doc-2023.201.2.22svn64299-54.1.noarch.rpm"
RPM_HASH = "0e096865849b1f288e2fb2763afc31fbb6be2e8a5c027fd1a1e7e18a6c36c3c927c9091360374342059a58e394598c821ff5e5e701811c45451625821662d46b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-llncs-doc"
RDEPENDS:${PN} += ""

inherit rpm
