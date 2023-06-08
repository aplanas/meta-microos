SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-appliance-docker-20230509-1651.1.aarch64.rpm"
RPM_HASH = "84c9cf5eb64108a13f4b1fa4ff2719eee06aed3302881210bbd401c38bb0b41183ce9777f97dd11df33c5ae1362f73f63860f87d3927de070cc6a5d04bf286f2"

RPROVIDES:${PN} += "flavor(appliance-docker) openSUSE-release-appliance-docker openSUSE-release-appliance-docker(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
