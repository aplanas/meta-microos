SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230509-1651.1.aarch64.rpm"
RPM_HASH = "31a809c42cbad323ccda1c1fd91202d39352ff57d81adc84172e0a85950cf4316afd815f7d264ea5a364055ae2f6a5fe385c4b7d2f557381b73f1821c4e0f5ea"

RPROVIDES:${PN} += "flavor(appliance-vagrant) openSUSE-release-appliance-vagrant openSUSE-release-appliance-vagrant(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
