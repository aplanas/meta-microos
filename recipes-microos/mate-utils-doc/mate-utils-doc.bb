SUMMARY = "Documentation how to mate-utils"
DESCRIPTION = "This package contains the documentation for mate-utils"
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-utils-doc-1.26.0-1.11.noarch.rpm"
RPM_HASH = "7f8cfc66785350311470199d43ce2b357d1cc276e3b4de185f765f51e0c7d837ee2e4648cbf625026be2dcc16734d3f755e21ba8cf87630f3f5fd8944ae0018d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-utils-doc"
RDEPENDS:${PN} += ""

inherit rpm
