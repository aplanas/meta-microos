SUMMARY = "Documentation for texlive-tkz-euclide"
DESCRIPTION = "This package includes the documentation for texlive-tkz-euclide"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.02csvn65724"

RPM_NAME = "texlive-tkz-euclide-doc-2023.201.5.02csvn65724-52.1.noarch.rpm"
RPM_HASH = "980905d5fa63aa682736e4a9d5e6df10d52c80defbaa3ee172b48c2d479b7db7a219d5635bfe42835ce68e5a1dcf7c227c9dd8dd6632c3489e8668f71777443a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-euclide-doc"
RDEPENDS:${PN} += ""

inherit rpm
