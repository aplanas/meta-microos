SUMMARY = "Documentation for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the HTML documentation."
LICENSE = "ICU"

PV = "73.1"

RPM_NAME = "libicu-doc-73.1-1.1.aarch64.rpm"
RPM_HASH = "1dfbc65bccae3a32fef7bc9dff161f23909903ddcee2dca99bc2de2577836b3642f09cc40f7d27736a70b53c421c3994b179c4e904d3fcbb722975af5428d582"

RPROVIDES:${PN} += "libicu-doc libicu-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
