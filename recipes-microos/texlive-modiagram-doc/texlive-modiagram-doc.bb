SUMMARY = "Documentation for texlive-modiagram"
DESCRIPTION = "This package includes the documentation for texlive-modiagram"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn56886"

RPM_NAME = "texlive-modiagram-doc-2023.201.0.0.3asvn56886-54.1.noarch.rpm"
RPM_HASH = "638416a6ff606e61f40805aa890e194c87962359495173a8bb18ba6ba362a9811668520da37baa82e82a6bb87b72205df14b75547127f2a90c3d881783fba9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-modiagram-doc:en) texlive-modiagram-doc"
RDEPENDS:${PN} += ""

inherit rpm
