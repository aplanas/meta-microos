SUMMARY = "Documentation for texlive-nomencl"
DESCRIPTION = "This package includes the documentation for texlive-nomencl"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.6svn61029"

RPM_NAME = "texlive-nomencl-doc-2023.201.5.6svn61029-54.1.noarch.rpm"
RPM_HASH = "f899ebd63aa0fd81109be8cb54db66a287ba722e0f887f8191bb079558c7b3285e4645c7566921ebec7829577f13bea9e374c179431d80f64300965d2b430d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nomencl-doc"
RDEPENDS:${PN} += ""

inherit rpm
