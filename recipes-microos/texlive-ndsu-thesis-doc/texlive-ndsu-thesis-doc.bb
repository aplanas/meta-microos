SUMMARY = "Documentation for texlive-ndsu-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ndsu-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46639"

RPM_NAME = "texlive-ndsu-thesis-doc-2023.201.svn46639-54.1.noarch.rpm"
RPM_HASH = "ec3083912cb3b80b5dc32847ef39fe04890f6b9aaf9ee90f0b8d6ae7e340b64b5166399f03edc13f78f03cca3753460bb6721557eea1ba1f94b7511f4a9446cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ndsu-thesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
