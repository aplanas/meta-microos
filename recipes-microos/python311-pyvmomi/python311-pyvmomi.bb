SUMMARY = "VMware vSphere Python SDK"
DESCRIPTION = "pyVmomi is the Python SDK for the VMware vSphere API that allows you to manage \
ESX, ESXi, and vCenter."
LICENSE = "Apache-2.0"

PV = "7.0.3"

RPM_NAME = "python311-pyvmomi-7.0.3-2.7.noarch.rpm"
RPM_HASH = "63c5b24759a3c52ad2b0bb2b8b96bf19793990984ed48e046adaf7c2c7b8a92f0f1a1f8933b0c936c2145599b8401ad5ec366aa0bfbefe09c4ab3c3ea8006758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyvmomi) python311-pyvmomi python3dist(pyvmomi)"
RDEPENDS:${PN} += "python(abi) python311-requests python311-six"

inherit rpm
