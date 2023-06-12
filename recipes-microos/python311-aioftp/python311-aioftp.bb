SUMMARY = "FTP client/server for asyncio"
DESCRIPTION = "aioftp is a python FTP client/server based on asyncio."
LICENSE = "Apache-2.0"

PV = "0.21.4"

RPM_NAME = "python311-aioftp-0.21.4-2.3.noarch.rpm"
RPM_HASH = "561ffeb568093c881a147653c3326271ad094df660d2695d1cf47b2f9c1b52a04b6df6acde8d801a637ce4cebec3ec6f98a967b74ab8017df75337b08257e710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aioftp) \
python311-aioftp \
python3dist(aioftp)"
RDEPENDS:${PN} += "python(abi) \
python311-siosocks"

inherit rpm
