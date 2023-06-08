SUMMARY = "Documentation for texlive-hf-tikz"
DESCRIPTION = "This package includes the documentation for texlive-hf-tikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-doc-2023.201.0.0.3asvn34733-53.1.noarch.rpm"
RPM_HASH = "62e235a5ce1a13bb6d9001d733c5143fa2e5ec032a75422cef3104e748b338fb3e92ca9fbb56192a8a6d6cdf1ce3da743be8c1632e8f5c0ef29a1a3cc7d3086e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hf-tikz-doc"
RDEPENDS:${PN} += ""

inherit rpm
