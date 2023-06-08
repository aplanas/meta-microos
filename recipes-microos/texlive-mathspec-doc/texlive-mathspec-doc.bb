SUMMARY = "Documentation for texlive-mathspec"
DESCRIPTION = "This package includes the documentation for texlive-mathspec"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn42773"

RPM_NAME = "texlive-mathspec-doc-2023.201.0.0.2bsvn42773-52.1.noarch.rpm"
RPM_HASH = "69657f96f99b21447bf227adf5293af77cca6fbf0916a92d589725930567f104ce9e15990ddb62357eefb2e48662b0c35081d5a2d094d22a3c15efb6bc70024b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathspec-doc"
RDEPENDS:${PN} += ""

inherit rpm
