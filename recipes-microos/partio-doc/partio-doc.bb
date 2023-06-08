SUMMARY = "Documentation files for partio"
DESCRIPTION = "The partio-doc contains documentastion for the library."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "partio-doc-1.14.6-1.9.noarch.rpm"
RPM_HASH = "aa19238940a43992e3d1e2fd14f548d5dc469e1c879cfd532dbb34b1c8ecd7f73966e7f54742ee47f3c3866a1885fa08414ff703dbcf698874b570040f7e9883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "partio-doc"
RDEPENDS:${PN} += "partio"

inherit rpm
