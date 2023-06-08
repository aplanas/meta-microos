SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-mgmt-paloaltonetworksngfw-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "c799df2c9bd2ffee642f2662215dd4dac2de4d0bc89ddfdedf2ea42b7aaf2f642b3a8eacf716f64ca5be5c2a980e830796c82b8828d3fa55db45654fce716307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-paloaltonetworksngfw) python311-azure-mgmt-paloaltonetworksngfw python3dist(azure-mgmt-paloaltonetworksngfw)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
