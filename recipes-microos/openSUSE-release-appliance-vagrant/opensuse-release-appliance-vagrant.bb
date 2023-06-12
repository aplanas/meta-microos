SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230604-1684.1.aarch64.rpm"
RPM_HASH = "44245fc34ddb085d1491fbeced9a85f7b32c4fb30891bba175fdd7315c715d2c8e3a248ff2e763dedd149948f6f2cdf57efd21e1223f5b521864f6af5ac89d94"

RPROVIDES:${PN} += "flavor(appliance-vagrant) openSUSE-release-appliance-vagrant openSUSE-release-appliance-vagrant(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
