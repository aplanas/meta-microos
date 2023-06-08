SUMMARY = "Documentation for texlive-recipebook"
DESCRIPTION = "This package includes the documentation for texlive-recipebook"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn37026"

RPM_NAME = "texlive-recipebook-doc-2023.201.svn37026-53.1.noarch.rpm"
RPM_HASH = "ac0a29c7ef699f6f70be7246af861f91705cb846a28abaf2bd81c2fe4d004fce8dac2fe8d9091cac6c62776464a8cac9e8af9fa4595e32b7b5b6ef995c6933dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipebook-doc"
RDEPENDS:${PN} += ""

inherit rpm
