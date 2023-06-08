SUMMARY = "Documentation for texlive-nidanfloat"
DESCRIPTION = "This package includes the documentation for texlive-nidanfloat"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn48295"

RPM_NAME = "texlive-nidanfloat-doc-2023.201.svn48295-54.1.noarch.rpm"
RPM_HASH = "c14da762a5394ec9770f5a2385931d2ed42ed1e78194712349976de8b72e740b456cbb53f1f262716b55d6294983774b0913e583a1f4a4fe18f9903951d7b0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-nidanfloat-doc:ja) texlive-nidanfloat-doc"
RDEPENDS:${PN} += ""

inherit rpm
