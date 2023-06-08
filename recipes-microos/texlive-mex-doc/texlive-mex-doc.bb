SUMMARY = "Documentation for texlive-mex"
DESCRIPTION = "This package includes the documentation for texlive-mex"
LICENSE = "SUSE-TeX"

PV = "2023.201.1.05asvn58661"

RPM_NAME = "texlive-mex-doc-2023.201.1.05asvn58661-54.1.noarch.rpm"
RPM_HASH = "4fe47fa070732a08dbec9a091d3985ab4529d3ed97f522d3ea5cf4db5a55a358652625ce623eda500f079b05a230703339d9a9093064a16ac176f45f04bb298f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mex-doc"
RDEPENDS:${PN} += ""

inherit rpm
