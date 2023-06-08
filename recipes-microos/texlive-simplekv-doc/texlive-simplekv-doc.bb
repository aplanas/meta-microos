SUMMARY = "Documentation for texlive-simplekv"
DESCRIPTION = "This package includes the documentation for texlive-simplekv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn64578"

RPM_NAME = "texlive-simplekv-doc-2023.201.0.0.2asvn64578-53.1.noarch.rpm"
RPM_HASH = "b4b5f55f45b91655d4684bf9b6528df6e9023b6cd112797e2aef8e4b94736f2560ce639bf0a0ec372a46244d211baf189a30033af1d42f93257949c8b5542437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-simplekv-doc:fr) texlive-simplekv-doc"
RDEPENDS:${PN} += ""

inherit rpm
