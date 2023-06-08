SUMMARY = "Documentation for texlive-rjlparshap"
DESCRIPTION = "This package includes the documentation for texlive-rjlparshap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "ec22103ff68207dfaa41a48e0dab064bdca2f745feb8f902b08981f773420f661924700ab37d5e077ad5379397ff72077c63b8af76c8736fda1c0c4d9c1474f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rjlparshap-doc"
RDEPENDS:${PN} += ""

inherit rpm
