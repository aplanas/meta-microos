SUMMARY = "Documentation for texlive-gridslides"
DESCRIPTION = "This package includes the documentation for texlive-gridslides"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-doc-2023.201.0.0.1.1svn54512-53.1.noarch.rpm"
RPM_HASH = "3b58b4c94eef4f1a24bf66ba38a6b1aabcaf0dac7f869eb2bf61dc6f40ea1e54b9a2a0a775b692f0e355fef27193f2d86b960df6a3176fa8b67c90dffddf5c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridslides-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
