SUMMARY = "MS Azure Communication Network Traversal Service Client Library for Python"
DESCRIPTION = "Azure Communication Network Traversal is managing TURN credentials for Azure Communication Services. \
 \
It will provide TURN credentials to a user."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python310-azure-communication-networktraversal-1.1.0~b1-1.2.noarch.rpm"
RPM_HASH = "62ddd48c3a02b01a4129cf3f38aa3e90b4a12d380485fc66ae44e214dbccdba3389151003b20a467b7de039a448fde76ec32e01388eb642c2985608df67ad4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-networktraversal python3.10dist(azure-communication-networktraversal) python310-azure-communication-networktraversal python3dist(azure-communication-networktraversal)"
RDEPENDS:${PN} += "python(abi) python310-azure-communication-nspkg python310-azure-core python310-azure-nspkg python310-msrest"

inherit rpm
