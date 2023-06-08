SUMMARY = "Microsoft Azure Dataprotection Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dataprotection Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-dataprotection-1.0.0.0-1.2.noarch.rpm"
RPM_HASH = "38398c0859013e4f34e82db4cbd29db6614c778b63e85359d020b00ad55378d8865dd67460f123a6530a64965e1edfc77d79b903f9fed8c1d07f2055d46eb94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-dataprotection) python39-azure-mgmt-dataprotection python3dist(azure-mgmt-dataprotection)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
