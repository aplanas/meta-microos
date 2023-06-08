SUMMARY = "Open vSwitch Documentation"
DESCRIPTION = "Contains additional documentation for the Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-doc-3.1.0-13.1.noarch.rpm"
RPM_HASH = "d7f0488e4fc9f4e607523dc7b3438e58b9912fd90e7de17e4e7db582d73c649684e783e8c43932b2eb80d8f54e25226f45c9b9195776398b7fdb9c4f9a7d5721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvswitch-doc"
RDEPENDS:${PN} += ""

inherit rpm
