SUMMARY = "Documentation for texlive-biblatex-claves"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-claves"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn43723"

RPM_NAME = "texlive-biblatex-claves-doc-2023.201.1.2.1svn43723-53.1.noarch.rpm"
RPM_HASH = "1babd5c7b5458b5c9b0ffb0b87a52f6475e2dca5dbe032eaba0b2c4dffe1fe633064729cf5b444b09d295219b94533fa45a06384b9f6fa50bda62509a18035be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-claves-doc"
RDEPENDS:${PN} += ""

inherit rpm
