SUMMARY = "Documentation for texlive-imtekda"
DESCRIPTION = "This package includes the documentation for texlive-imtekda"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn17667"

RPM_NAME = "texlive-imtekda-doc-2023.201.1.7svn17667-52.1.noarch.rpm"
RPM_HASH = "43c0f85bcf5fe8998286b81cb6c50c6c7985689e02147be9915045776d1488f38b0251267dbf037108e72f3912bea0eaa0cdca893caacc5fc664c061ca6626d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-imtekda-doc:de) texlive-imtekda-doc"
RDEPENDS:${PN} += ""

inherit rpm
