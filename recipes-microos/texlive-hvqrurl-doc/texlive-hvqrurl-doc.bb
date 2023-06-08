SUMMARY = "Documentation for texlive-hvqrurl"
DESCRIPTION = "This package includes the documentation for texlive-hvqrurl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn59256"

RPM_NAME = "texlive-hvqrurl-doc-2023.201.0.0.02svn59256-52.1.noarch.rpm"
RPM_HASH = "3d06c4127dd2782f98ad4a7970d2793f4957a99a4be73cd8c55bff458b31bd014d5885a74c7cce5d4665ca0ef99ac52a6f8a4c098bb8f2014b7cbbfbfa9e3bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvqrurl-doc"
RDEPENDS:${PN} += ""

inherit rpm
