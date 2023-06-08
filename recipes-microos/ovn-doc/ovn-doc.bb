SUMMARY = "Open Virtual Network Documentation"
DESCRIPTION = "Contains additional documentation for OVN."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-doc-23.03.0-13.1.noarch.rpm"
RPM_HASH = "9a00bb7fc3069bb466a03ec449ff1167cfe12ec6d0b085acb0eb2563fd091e6ba472f03e652056da6211a119fb8ba9fcb7dd29bcb89efeb900d7e8bf2e5f6af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ovn-doc"
RDEPENDS:${PN} += ""

inherit rpm
