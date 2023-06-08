SUMMARY = "Documentation for texlive-warpcol"
DESCRIPTION = "This package includes the documentation for texlive-warpcol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn15878"

RPM_NAME = "texlive-warpcol-doc-2023.201.1.0csvn15878-53.1.noarch.rpm"
RPM_HASH = "b9514f54deb71a7aac0d80ecc1efb47a042ffc13fd4d5ba69f6f85463907e6cda5a7909ebcdcefca46582e2a9f80edaea42882f8cd7e4db60bb5d72a523b1d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-warpcol-doc"
RDEPENDS:${PN} += ""

inherit rpm
