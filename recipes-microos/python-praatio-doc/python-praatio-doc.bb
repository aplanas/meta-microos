SUMMARY = "Documentation files for praatio"
DESCRIPTION = "HTML Documentation and examples for praatio."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python-praatio-doc-4.1.0-1.12.noarch.rpm"
RPM_HASH = "a18844b1ac012dd298ba682d3d8f511c6668bb94c67284e5ba61f2c8b669d4cfbe9b7e06f1184edb60ddb39966c272c1fd47fabfda2c69549c647cb2f9494418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-praatio-doc python310-praatio-doc python311-praatio-doc python39-praatio-doc"
RDEPENDS:${PN} += ""

inherit rpm
