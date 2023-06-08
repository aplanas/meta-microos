SUMMARY = "Azure Device Update for IoT Hub client library for Python"
DESCRIPTION = "The library provides access to the Device Update for IoT Hub service that \
enables customers to publish updates for their IoT devices to the cloud, \
and then deploy these updates to their devices (approve updates to groups \
of devices managed and provisioned in IoT Hub)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-iot-deviceupdate-1.0.0-1.3.noarch.rpm"
RPM_HASH = "e9d8e4218047eefbd00034fed4eed82eff06ae971f6dfaf8fcb384f339e2b6a7a3ea649fbfa38c7242dc035f7fd506d1d9509b9da805fc2c103f198cd03eea16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-iot-deviceupdate) python39-azure-iot-deviceupdate python3dist(azure-iot-deviceupdate)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-iot-nspkg python39-isodate"

inherit rpm
