SUMMARY = "Documentation for texlive-concrete"
DESCRIPTION = "This package includes the documentation for texlive-concrete"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn57963"

RPM_NAME = "texlive-concrete-doc-2023.201.svn57963-53.1.noarch.rpm"
RPM_HASH = "e08d8a1655be5a9c993b27fde59a33917ea6b000ce7fc8259a4631914e81c9dff9c9b2195a3b098ca3d0a6c1cede25cd8cc3c9231d5a24c044979ffdf639e06a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concrete-doc"
RDEPENDS:${PN} += ""

inherit rpm
