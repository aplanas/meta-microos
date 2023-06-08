SUMMARY = "Documentation for texlive-isotope"
DESCRIPTION = "This package includes the documentation for texlive-isotope"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn23711"

RPM_NAME = "texlive-isotope-doc-2023.201.0.0.3svn23711-55.1.noarch.rpm"
RPM_HASH = "a1b1a22c9ce40a04ead9b9344cecf196b163466ce47fc5ff8c076b72faf0ce7e34633b585c3e053ae5114189b3c70e52a63b383a7bd2fd5012623197498350c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isotope-doc"
RDEPENDS:${PN} += ""

inherit rpm
