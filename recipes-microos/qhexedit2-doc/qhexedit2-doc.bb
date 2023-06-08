SUMMARY = "Documentation and examples for qhexedit2"
DESCRIPTION = "The qhexedit2-doc package contains the documentation and examples for qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "qhexedit2-doc-0.8.9-1.15.noarch.rpm"
RPM_HASH = "da167cc38fde29d680ffc7676f1f32330e28dc1eebe01dec17f77e772ea76bab6331b5e10d165b4a44e70a61b6cf3367e77639e7d41f52a57604ab414e60c6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qhexedit2-doc"
RDEPENDS:${PN} += ""

inherit rpm
