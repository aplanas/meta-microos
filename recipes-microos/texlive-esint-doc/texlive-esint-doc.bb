SUMMARY = "Documentation for texlive-esint"
DESCRIPTION = "This package includes the documentation for texlive-esint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2dsvn52240"

RPM_NAME = "texlive-esint-doc-2023.201.1.2dsvn52240-53.1.noarch.rpm"
RPM_HASH = "998bce7cdc1ca020c93e6743b1401525920953cb2b5e5010b506b9337c0cc3d2ded317e7f68b9668d748b8769fbe4e10e67a8f8b19107d50995172be5188f516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-doc"
RDEPENDS:${PN} += ""

inherit rpm
