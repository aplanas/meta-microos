SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-appliance-openstack-20230509-1651.1.aarch64.rpm"
RPM_HASH = "553907dbe7371fcc091edf2ca4bb26ed7f39e56e885de09219357e7e351ade46b4c228782add6518ae529625b803b211c0e2d2292bf044aa7865c8fd17e0d0df"

RPROVIDES:${PN} += "flavor(appliance-openstack) openSUSE-release-appliance-openstack openSUSE-release-appliance-openstack(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
