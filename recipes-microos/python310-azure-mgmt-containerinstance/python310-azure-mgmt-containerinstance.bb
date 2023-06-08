SUMMARY = "Microsoft Azure Container Instance Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Instance Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python310-azure-mgmt-containerinstance-10.1.0-1.1.noarch.rpm"
RPM_HASH = "693b9b867b1bfa45a885c92e586b2645ebb3a7d568fdd549f4215bf1a3e86ec5c8f2505174bc9042bf10e1528617f1465efca8d66973b37405c7a4779850853b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerinstance python3.10dist(azure-mgmt-containerinstance) python310-azure-mgmt-containerinstance python3dist(azure-mgmt-containerinstance)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.0.1 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
