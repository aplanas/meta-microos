SUMMARY = "Documentation for the libcdr API"
DESCRIPTION = "This package contains documentation for the libcdr API."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-devel-doc-0.1.7-1.17.noarch.rpm"
RPM_HASH = "a5c9b210babc85fd8f0d31f8f9c0f1873883c9c05e147ae9ccddddebb5734a2b573108ff9b91640441886e984f91586066244d00e1d1fb1f69410a57a8c300c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcdr-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
