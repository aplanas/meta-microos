SUMMARY = "Microsoft Azure Datadog Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Datadog Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-datadog-2.0.0-1.8.noarch.rpm"
RPM_HASH = "cb19202254792cc7282055b693e2439e5b268855de70e3ba21446be94c16bd67b06f4f4207cb7901bd4baa7b59e1eccbf3e9b2778a5d672f4cdbc3277866434c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-datadog) python311-azure-mgmt-datadog python3dist(azure-mgmt-datadog)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
