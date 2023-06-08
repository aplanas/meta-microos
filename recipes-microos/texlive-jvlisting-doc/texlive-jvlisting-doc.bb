SUMMARY = "Documentation for texlive-jvlisting"
DESCRIPTION = "This package includes the documentation for texlive-jvlisting"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn24638"

RPM_NAME = "texlive-jvlisting-doc-2023.201.0.0.7svn24638-55.1.noarch.rpm"
RPM_HASH = "d7379ecc693e4570a9d21ec1a3ca8f4f3511e52eaaffff879d5c1d850b5be6bb4e5a74dad796f180f4d304b89f92ba757a18cbebf1e8e4d1c10a1d4f7485faca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jvlisting-doc"
RDEPENDS:${PN} += ""

inherit rpm
