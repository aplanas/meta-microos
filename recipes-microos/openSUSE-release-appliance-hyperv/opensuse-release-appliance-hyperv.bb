SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230509-1651.1.aarch64.rpm"
RPM_HASH = "4125d17f8eadd4092fd380aac9998739a8de2bb29b4aba4ef5bb5829a01e952e8f7fad1bbf6c6a144d3dc5c4a6ed56957273dc7b42b19018dedb139d49c4005c"

RPROVIDES:${PN} += "flavor(appliance-hyperv) openSUSE-release-appliance-hyperv openSUSE-release-appliance-hyperv(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
