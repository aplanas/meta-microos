SUMMARY = "Setroubleshoot documentation"
DESCRIPTION = "Setroubleshoot documentation package"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.30"

RPM_NAME = "setroubleshoot-doc-3.3.30-2.2.noarch.rpm"
RPM_HASH = "e1a8eda63c57df7a1c28fa6d4b499dcbd093996a6dc8fe1a296742e593085537bf3d38f68dc84f0c4096ced7b2d8fd3ded3761b3eb127432473abc8214e60087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setroubleshoot-doc"
RDEPENDS:${PN} += "setroubleshoot"

inherit rpm
