SUMMARY = "Documentation for texlive-dvdcoll"
DESCRIPTION = "This package includes the documentation for texlive-dvdcoll"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-dvdcoll-doc-2023.201.1.1asvn15878-53.1.noarch.rpm"
RPM_HASH = "788e6dec52bf5f10d92b40643a9a40c9c394bbc0826662c43a8795352b72bc8c4cba7e8c387f650e314cd7e16dd98bd4cc13167f23872201a015cb888ae78044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-dvdcoll-doc:en;de) \
texlive-dvdcoll-doc"
RDEPENDS:${PN} += ""

inherit rpm
