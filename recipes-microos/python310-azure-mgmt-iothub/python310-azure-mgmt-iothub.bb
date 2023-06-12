SUMMARY = "Microsoft Azure IoTHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-azure-mgmt-iothub-2.4.0-1.1.noarch.rpm"
RPM_HASH = "f63eb549979183dbc4cd78e81432ce3c4a10924e8324944fd5802b3d9a1dacccfe7d2ba9f11434ad9e50ce04c8f1510b8b438847784d62a1a77e20e9e3a3864b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iothub \
python3.10dist(azure-mgmt-iothub) \
python310-azure-mgmt-iothub \
python3dist(azure-mgmt-iothub)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
