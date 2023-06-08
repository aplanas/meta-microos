SUMMARY = "Azure Azure Digital Twins Core client library for Python"
DESCRIPTION = "This package contains an SDK for Azure Digital Twins API to provide access to \
the Azure Digital Twins service for managing twins, models, relationships, etc."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-digitaltwins-core-1.2.0-1.3.noarch.rpm"
RPM_HASH = "f4e5b127c946fac83d22faf617aac3efb3d6327f1801a3ca05fa497e4b6e6733d879fdf528cd4a6eac72a14078bdd54c09f2920960c75185e9cdbcd399007c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-digitaltwins-core python3.10dist(azure-digitaltwins-core) python310-azure-digitaltwins-core python3dist(azure-digitaltwins-core)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-digitaltwins-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
