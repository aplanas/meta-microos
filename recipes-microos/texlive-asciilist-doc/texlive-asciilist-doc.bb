SUMMARY = "Documentation for texlive-asciilist"
DESCRIPTION = "This package includes the documentation for texlive-asciilist"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2bsvn49060"

RPM_NAME = "texlive-asciilist-doc-2023.201.2.2bsvn49060-53.1.noarch.rpm"
RPM_HASH = "9be20f40692c214d918f11f47e5cd6002284e1c9801e1a6ca90b4feb45725220c9bf340bb8bcbe36483a7efa9a2b77c9a4e31aa3105c3ef34d48b59031f2faa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asciilist-doc"
RDEPENDS:${PN} += ""

inherit rpm
