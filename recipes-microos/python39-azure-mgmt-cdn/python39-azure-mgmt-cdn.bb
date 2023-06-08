SUMMARY = "Microsoft Azure CDN Management Client Library"
DESCRIPTION = "This is the Microsoft Azure CDN Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python39-azure-mgmt-cdn-12.0.0-1.6.noarch.rpm"
RPM_HASH = "1f58352449c33288f4c0f89195e465f3c69b364b8ee749b2597d622019049eae39f8eb386417e894c14d566350677dae1acd9bba105922dfe452a3fc211772f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-cdn) python39-azure-mgmt-cdn python3dist(azure-mgmt-cdn)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
