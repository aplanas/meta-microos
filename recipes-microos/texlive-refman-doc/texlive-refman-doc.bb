SUMMARY = "Documentation for texlive-refman"
DESCRIPTION = "This package includes the documentation for texlive-refman"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0esvn15878"

RPM_NAME = "texlive-refman-doc-2023.201.2.0esvn15878-53.1.noarch.rpm"
RPM_HASH = "7a1e80183900bccab08a9f8144f717d306739b02841a60ef729bf2856247ac2642bbb3fb7e8fc8c0b8aadae9ebb52e920ccfd86d8fa3f0294e5e51b78fa019c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-refman-doc:de;en) \
texlive-refman-doc"
RDEPENDS:${PN} += ""

inherit rpm
