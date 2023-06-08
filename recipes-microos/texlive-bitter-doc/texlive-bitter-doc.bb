SUMMARY = "Documentation for texlive-bitter"
DESCRIPTION = "This package includes the documentation for texlive-bitter"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64541"

RPM_NAME = "texlive-bitter-doc-2023.201.svn64541-52.1.noarch.rpm"
RPM_HASH = "a1885238a85f7e98be1dee2e24f5c3442eec45cce22221eb5a0e1ba181adf5f545a689185b4b446f2d5cd8b5de883c4b61624176907ec7fca1c5c1ad87b82d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitter-doc"
RDEPENDS:${PN} += ""

inherit rpm
