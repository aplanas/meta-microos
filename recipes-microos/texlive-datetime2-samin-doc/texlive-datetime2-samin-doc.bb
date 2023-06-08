SUMMARY = "Documentation for texlive-datetime2-samin"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-samin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49346"

RPM_NAME = "texlive-datetime2-samin-doc-2023.201.1.1svn49346-52.1.noarch.rpm"
RPM_HASH = "63db4f8ec33a94d3b62c435773e9f7390acd17aa5d172a6690c178201ea0e20c69572f416939f227afd2771c0e199ccfb6f5db4c302239106a464408624caf78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-samin-doc"
RDEPENDS:${PN} += ""

inherit rpm
