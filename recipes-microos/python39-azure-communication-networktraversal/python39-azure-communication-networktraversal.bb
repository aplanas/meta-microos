SUMMARY = "MS Azure Communication Network Traversal Service Client Library for Python"
DESCRIPTION = "Azure Communication Network Traversal is managing TURN credentials for Azure Communication Services. \
 \
It will provide TURN credentials to a user."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python39-azure-communication-networktraversal-1.1.0~b1-1.2.noarch.rpm"
RPM_HASH = "fa24060ea7097bd291ac64048e9976368d3ecfb491fe5dff5da896dbbd6166b52af3947288c09bedaf0f96931b6bd3ad3ccb3ec06814976fa3d379fd576460bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-communication-networktraversal) \
python39-azure-communication-networktraversal \
python3dist(azure-communication-networktraversal)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-communication-nspkg \
python39-azure-core \
python39-azure-nspkg \
python39-msrest"

inherit rpm
