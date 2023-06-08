SUMMARY = "Documentation for texlive-computational-complexity"
DESCRIPTION = "This package includes the documentation for texlive-computational-complexity"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.25fsvn44847"

RPM_NAME = "texlive-computational-complexity-doc-2023.201.2.25fsvn44847-53.1.noarch.rpm"
RPM_HASH = "857c85d25e836f94cee0c6b8ab70f0a8d45efa41d8cf40acee2b43d056d7d1c9689ca8788823c3e08dbfad882ebcce7e61efd8623930fde63d8b8bbd19c94125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-computational-complexity-doc"
RDEPENDS:${PN} += ""

inherit rpm
