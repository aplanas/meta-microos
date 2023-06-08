SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-appliance-custom-20230509-1651.1.aarch64.rpm"
RPM_HASH = "dc80bdb424cc3d2637e3df5623a9ff139bc94644a6d5ed5c6a54abbc9e50e261730230f4894fd335cf6031fc05d4c6ea193c2e84b0aa52ab00792b53f6f0ac3e"

RPROVIDES:${PN} += "flavor(appliance-custom) openSUSE-release-appliance-custom openSUSE-release-appliance-custom(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
