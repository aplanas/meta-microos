SUMMARY = "Documentation for the C development libraries for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. \
 \
This subpackage contains the documentation."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "qpid-proton-devel-doc-0.38.0-1.4.noarch.rpm"
RPM_HASH = "45a20889b8d0ba8c58c9aa3d72f61785a128784a7411be3adc91dd7a3f81ad532e6fc019e71b384ad73941b43136587dac9fb57bdf0fd37de182da7bff332098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpid-proton qpid-proton-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
