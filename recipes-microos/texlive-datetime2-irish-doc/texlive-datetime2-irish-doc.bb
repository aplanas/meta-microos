SUMMARY = "Documentation for texlive-datetime2-irish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-irish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47632"

RPM_NAME = "texlive-datetime2-irish-doc-2023.201.1.1svn47632-52.1.noarch.rpm"
RPM_HASH = "3286b5f4de05c7cc17ea16e0e2a29baec5db1db7ffd4e3132375339d147670a33d8218e678850ddda55138bfff0bab1b64b32dc71671a6113e3b3df8f65844c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-irish-doc"
RDEPENDS:${PN} += ""

inherit rpm
