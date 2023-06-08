SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-appliance-vmware-20230509-1651.1.aarch64.rpm"
RPM_HASH = "1f5e63e00b396cf0883fb54ddc44f272ee32806910a80ae256bf6b2df52f636de2d1c37d154e3203681547680284fa1513ab2c0203affc5b0d0c4c4ef07e64e5"

RPROVIDES:${PN} += "flavor(appliance-vmware) openSUSE-release-appliance-vmware openSUSE-release-appliance-vmware(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
