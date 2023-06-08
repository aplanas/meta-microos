SUMMARY = "Documentation for texlive-decorule"
DESCRIPTION = "This package includes the documentation for texlive-decorule"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn55230"

RPM_NAME = "texlive-decorule-doc-2023.201.0.0.7svn55230-52.1.noarch.rpm"
RPM_HASH = "4e9d9cc4e7bcb88a0d38d09eda7189188065bdf05921f936a21438047a8a5aa2e31c9ad74a8f0b4a03c75ac47ad66f248f0d0629b0d399159279c86d56772343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decorule-doc"
RDEPENDS:${PN} += ""

inherit rpm
