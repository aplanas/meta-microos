SUMMARY = "Documentation for texlive-articleingud"
DESCRIPTION = "This package includes the documentation for texlive-articleingud"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn38741"

RPM_NAME = "texlive-articleingud-doc-2023.201.0.0.3svn38741-53.1.noarch.rpm"
RPM_HASH = "684a4cffc364c2ca8aac1f49ad114d2e0df8038631d34a16416c2a67e53f93a2791b038c2047326d177a3ff626ecaa5283e1cdfa2eb01bb6a8042b4e50fb827d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-articleingud-doc:es) texlive-articleingud-doc"
RDEPENDS:${PN} += ""

inherit rpm
