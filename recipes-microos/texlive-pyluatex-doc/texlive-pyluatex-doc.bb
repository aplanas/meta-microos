SUMMARY = "Documentation for texlive-pyluatex"
DESCRIPTION = "This package includes the documentation for texlive-pyluatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6.1svn65855"

RPM_NAME = "texlive-pyluatex-doc-2023.201.0.0.6.1svn65855-53.1.noarch.rpm"
RPM_HASH = "e128eb39932e1a98f81691926df0e5f5c6e9440f4a96650821d8888e71f24d35e176a1cda408b200f817e027da80e0b02971baaa346e4cf11301d7f5a17b8ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pyluatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
