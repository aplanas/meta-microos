SUMMARY = "Microsoft Azure Management Core Library"
DESCRIPTION = "This is the Microsoft Azure Management Core Library. \
 \
Azure management core library defines extensions to Azure Core that are specific \
to ARM (Azure Resource Management) needed when you use client libraries. \
 \
As an end user, you don't need to manually install azure-mgmt-core because it will \
be installed automatically when you install other SDKs."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-azure-mgmt-core-1.4.0-1.1.noarch.rpm"
RPM_HASH = "049e9ebfb2dedad6dfe5eef0705a5ce16812d9245abc6553d2c621bcbbf197c725dc29dcbd03e3189823ff343f2d4a05e72f529d8f6d0a08e8ef85ed6dd9d8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-core python3.10dist(azure-mgmt-core) python310-azure-mgmt-core python3dist(azure-mgmt-core)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-mgmt-nspkg python310-azure-nspkg"

inherit rpm
