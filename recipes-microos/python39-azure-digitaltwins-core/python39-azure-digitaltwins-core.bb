SUMMARY = "Azure Azure Digital Twins Core client library for Python"
DESCRIPTION = "This package contains an SDK for Azure Digital Twins API to provide access to \
the Azure Digital Twins service for managing twins, models, relationships, etc."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-digitaltwins-core-1.2.0-1.3.noarch.rpm"
RPM_HASH = "59dc8190f801fc5c9725d083e4f418d88046059188e5df4da652d589128b3a93e427ab5d88df82cfe610d32934edf84a9d0e953c6f78062b1ac2b2a700ca726c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-digitaltwins-core) python39-azure-digitaltwins-core python3dist(azure-digitaltwins-core)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-digitaltwins-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
