SUMMARY = "Documents for slf4j"
DESCRIPTION = "Manual for slf4j."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-manual-1.7.36-3.3.noarch.rpm"
RPM_HASH = "2fe4682899b37fa93640278854e377295a885f9e571dcbf64aed7f6b0f6c935b4d4f3a03421a845b9e66a8ddb2d4a768966d3aecef7743198765d321c42bae7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slf4j-manual"
RDEPENDS:${PN} += ""

inherit rpm
