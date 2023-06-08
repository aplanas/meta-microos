SUMMARY = "Microsoft Azure IoT namespace package"
DESCRIPTION = "This is the Microsoft Azure IoT namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.iot namespace."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-azure-iot-nspkg-1.0.1-1.2.noarch.rpm"
RPM_HASH = "60b2d02c25ff3fcba1b1c50fa6d938c6176845b6af2ae4e20d5ff2380ff0aff31482ce89465b59d74f091f7479447def9b1440a7c1d4c41bbbb1d5de52711721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-iot-nspkg) python311-azure-iot-nspkg python3dist(azure-iot-nspkg)"
RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
