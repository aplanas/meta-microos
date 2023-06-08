SUMMARY = "Documentation and examples for the Qore xml module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
xml module."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "qore-xml-module-doc-1.8.0-1.3.noarch.rpm"
RPM_HASH = "52da76bec6c40503364603cecb500dd30f582a03a1e11799e3475758e0b7602be6b9e283641d4bccbcdcbef4ea0f941d3fd4eda422964292d4680cc93d65e846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-xml-module-doc"
RDEPENDS:${PN} += ""

inherit rpm
