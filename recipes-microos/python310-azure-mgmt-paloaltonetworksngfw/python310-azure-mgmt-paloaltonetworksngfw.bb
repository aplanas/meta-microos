SUMMARY = "Microsoft Azure Paloaltonetworksngfw Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Paloaltonetworksngfw Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-mgmt-paloaltonetworksngfw-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "a74d613c643c3555c8a9bf95bf9e405dc6644964a1f2db77e070ff09376f635bb4712e995ae2bbfd5cc58b59de66227bcbe34b34f4a5873283d1773855b2f712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-paloaltonetworksngfw python3.10dist(azure-mgmt-paloaltonetworksngfw) python310-azure-mgmt-paloaltonetworksngfw python3dist(azure-mgmt-paloaltonetworksngfw)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
