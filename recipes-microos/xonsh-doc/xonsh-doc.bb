SUMMARY = "Documentation files for xonsh"
DESCRIPTION = "HTML documentation on the API and examples for xonsh."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.13.4"

RPM_NAME = "xonsh-doc-0.13.4-1.3.noarch.rpm"
RPM_HASH = "2cc21530e3cd2438a9cc17e188b8dd6efd1802ae907c71b7c28b24cf74938829170c29492b89803c690430bad02290e865e353ef77994d2d8ac553d78a04300d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xonsh-doc"
RDEPENDS:${PN} += ""

inherit rpm
