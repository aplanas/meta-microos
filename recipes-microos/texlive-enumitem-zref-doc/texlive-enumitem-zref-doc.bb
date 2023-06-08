SUMMARY = "Documentation for texlive-enumitem-zref"
DESCRIPTION = "This package includes the documentation for texlive-enumitem-zref"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn21472"

RPM_NAME = "texlive-enumitem-zref-doc-2023.201.1.8svn21472-53.1.noarch.rpm"
RPM_HASH = "e09f6eef02b99601a3b09c1c9f3f80682bc433aef8a4c099178b2f4b6ed95cab8d83712f3d0de37e27ddbd621212c58ccafc2b49530b5b5d03e9c484ce761fff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-zref-doc"
RDEPENDS:${PN} += ""

inherit rpm
