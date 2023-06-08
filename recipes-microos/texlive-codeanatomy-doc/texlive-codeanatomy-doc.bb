SUMMARY = "Documentation for texlive-codeanatomy"
DESCRIPTION = "This package includes the documentation for texlive-codeanatomy"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4_betasvn65648"

RPM_NAME = "texlive-codeanatomy-doc-2023.201.0.0.4_betasvn65648-53.1.noarch.rpm"
RPM_HASH = "731755bf737a6b9349d45c1acd7bc799ca1562beb62646506f1536d071eb3beea1cd9a6ef5ed44af3eb749598453a55d379aa86cdb2c4c365e9a0e226d8975bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codeanatomy-doc"
RDEPENDS:${PN} += ""

inherit rpm
