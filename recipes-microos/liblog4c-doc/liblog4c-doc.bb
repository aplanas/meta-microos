SUMMARY = "Documentation for log4c"
DESCRIPTION = "The liblog4c-doc package contains the log4c documentation."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c-doc-1.2.4-5.26.aarch64.rpm"
RPM_HASH = "0f51858e72e84eb7caae872b2164365fd5a6ebb5862b0a554adbe56554b3f6106d585bb5c9585ba61be4bc46839de6e6dd9fb6d95d82f9d309b318bc80d4ae45"

RPROVIDES:${PN} += "liblog4c-doc liblog4c-doc(aarch-64)"
RDEPENDS:${PN} += "liblog4c3"

inherit rpm
