SUMMARY = "Documentation for texlive-bodegraph"
DESCRIPTION = "This package includes the documentation for texlive-bodegraph"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn61719"

RPM_NAME = "texlive-bodegraph-doc-2023.201.1.4svn61719-52.1.noarch.rpm"
RPM_HASH = "1b6612ac6e616c29f98b333316caaef7360c22acf50f1c76d2951085142d552728ec7b32e2fabb431f65882fbf0785f7eeaef945270522e4337687dfacccff4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bodegraph-doc"
RDEPENDS:${PN} += ""

inherit rpm
