SUMMARY = "Documentation for texlive-present"
DESCRIPTION = "This package includes the documentation for texlive-present"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn50048"

RPM_NAME = "texlive-present-doc-2023.201.2.2.1svn50048-52.1.noarch.rpm"
RPM_HASH = "f40fd6ad7341fcd6adb764af579eb95060e8dc6965e0d02d9cf8a3136e695fe20ba4478f4ce9755e21f743013ddc8aedc8528c066d8a41ea3ceccdc455d266c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-present-doc"
RDEPENDS:${PN} += ""

inherit rpm
