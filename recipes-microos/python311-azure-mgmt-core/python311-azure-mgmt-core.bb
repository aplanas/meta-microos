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

RPM_NAME = "python311-azure-mgmt-core-1.4.0-1.1.noarch.rpm"
RPM_HASH = "f4b66821ae40bf3d681e980ec9b690dd973ff5dbcbbf825ae5ad9473789775b3ca0917c9c6f95dd7cb21cf63ed3d20d4b077d265477a9eaec7bb1453a8384993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-core) \
python311-azure-mgmt-core \
python3dist(azure-mgmt-core)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg"

inherit rpm
