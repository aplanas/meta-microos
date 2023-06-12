SUMMARY = "Documentation and examples for the Qore linenoise module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
linenoise module."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.0.1"

RPM_NAME = "qore-linenoise-module-doc-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "6917c85a3c5b37f167aadf90ced93678425d3a377ecaf6a3ad7f49a41febd7ff8591dfc7aff1a0482f4a0dae1acd7e608775666c3f20b8cf028580d5f12c736d"

RPROVIDES:${PN} += "qore-linenoise-module-doc \
qore-linenoise-module-doc(aarch-64)"
RDEPENDS:${PN} += "qore-linenoise-module"

inherit rpm
