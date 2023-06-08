SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python311-greenlet-devel-1.1.3-3.1.noarch.rpm"
RPM_HASH = "61668d35ce21651780ea510df91f3eedc0e996621a6bfc90f4f680a38b6f960379bd94049cd239436a888d49495c2501567efdd0bebeecbf7253d14849364b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-greenlet-devel"
RDEPENDS:${PN} += "python311-greenlet"

inherit rpm
