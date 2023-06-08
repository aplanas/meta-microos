SUMMARY = "Documentation for texlive-magra"
DESCRIPTION = "This package includes the documentation for texlive-magra"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57373"

RPM_NAME = "texlive-magra-doc-2023.201.0.0.0.1svn57373-52.1.noarch.rpm"
RPM_HASH = "2c6677d4fde0beebfbd22de4940c5a77a4aee20a8b65e6f31282a8034bfc651519407a983cfe9ffa34ee42aadd9cbe80a6cc6bb006ee542dab74291c9863b5bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magra-doc"
RDEPENDS:${PN} += ""

inherit rpm
