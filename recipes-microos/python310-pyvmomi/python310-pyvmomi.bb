SUMMARY = "VMware vSphere Python SDK"
DESCRIPTION = "pyVmomi is the Python SDK for the VMware vSphere API that allows you to manage \
ESX, ESXi, and vCenter."
LICENSE = "Apache-2.0"

PV = "7.0.3"

RPM_NAME = "python310-pyvmomi-7.0.3-2.7.noarch.rpm"
RPM_HASH = "0021589debc5e87defd4db4d3c6a7b51abaa9a26e5b35badb616293f03c93aeaf4b65ca74da727530acde7a55cad52e8e36cf2e18fb7654104c23beda215b900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvmomi python3.10dist(pyvmomi) python310-pyvmomi python3dist(pyvmomi)"
RDEPENDS:${PN} += "python(abi) python310-requests python310-six"

inherit rpm
