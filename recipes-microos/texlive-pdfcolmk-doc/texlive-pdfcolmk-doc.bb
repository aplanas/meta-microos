SUMMARY = "Documentation for texlive-pdfcolmk"
DESCRIPTION = "This package includes the documentation for texlive-pdfcolmk"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn52912"

RPM_NAME = "texlive-pdfcolmk-doc-2023.201.2.0svn52912-51.1.noarch.rpm"
RPM_HASH = "8ef2fcdbda111e1b078bf6438bdfe3f7c7da030f656d1ef4e2297a868a5a62ae36e0e391fdc1ee4ef49376338135a262fab4a4ba4c2bc375a951c131446a3d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcolmk-doc"
RDEPENDS:${PN} += ""

inherit rpm
