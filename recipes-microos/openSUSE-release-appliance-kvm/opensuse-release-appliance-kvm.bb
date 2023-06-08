SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-appliance-kvm-20230509-1651.1.aarch64.rpm"
RPM_HASH = "c698cb8063de8fc9f74953502eb8988744661a4aac8be06ce4e5d43cc0f840e4410bffb11b7943e014a55570e52b5e012fdab54c4639565e540bc52159cee8d9"

RPROVIDES:${PN} += "flavor(appliance-kvm) openSUSE-release-appliance-kvm openSUSE-release-appliance-kvm(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
