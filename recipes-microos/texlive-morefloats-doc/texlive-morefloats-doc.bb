SUMMARY = "Documentation for texlive-morefloats"
DESCRIPTION = "This package includes the documentation for texlive-morefloats"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn37927"

RPM_NAME = "texlive-morefloats-doc-2023.201.1.0hsvn37927-54.1.noarch.rpm"
RPM_HASH = "9c13853208474bf0ac7deaf04d3a76248cdef56a6f1087d11e403c08e1c0771a116b9c1f16a3df0d2362f77d19413baab156e1ca7fa8df9646b2a485c3d5b014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morefloats-doc"
RDEPENDS:${PN} += ""

inherit rpm
