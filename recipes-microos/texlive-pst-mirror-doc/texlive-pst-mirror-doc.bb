SUMMARY = "Documentation for texlive-pst-mirror"
DESCRIPTION = "This package includes the documentation for texlive-pst-mirror"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn60506"

RPM_NAME = "texlive-pst-mirror-doc-2023.201.1.02svn60506-52.1.noarch.rpm"
RPM_HASH = "7fdc1afb7f93194992691d24b89f139621f989b152ee8c0c173921213a0265ea8a17f431f931052e20c00ce3caa4230fa67eb5ac5b3917863abb62389dcfc325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-mirror-doc:fr) \
texlive-pst-mirror-doc"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl"

inherit rpm
