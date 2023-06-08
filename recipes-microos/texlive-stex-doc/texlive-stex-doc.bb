SUMMARY = "Documentation for texlive-stex"
DESCRIPTION = "This package includes the documentation for texlive-stex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.0svn64383"

RPM_NAME = "texlive-stex-doc-2023.201.3.2.0svn64383-57.1.noarch.rpm"
RPM_HASH = "6898401ce9e71698d329e64687a7a431b9a630c0cdb7a211980270321d46b32066baee1d1ae795d06f50d95315d922d08990f871b44bbe5efb8a8eb7c63051b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stex-doc"
RDEPENDS:${PN} += ""

inherit rpm
