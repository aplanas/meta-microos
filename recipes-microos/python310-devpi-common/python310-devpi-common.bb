SUMMARY = "Utilities jointly used by devpi-server and devpi-client"
DESCRIPTION = "Utilities jointly used by devpi-server and devpi-client."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "python310-devpi-common-3.7.2-2.2.noarch.rpm"
RPM_HASH = "0b1057983d12bdac120db983d527b721dca6fa5b97bb3f00de95be7590eb2573fffe92f28da0e9d8748a3c33af92e591e0de3ffca891b1c3745fb2e315507f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-common python3.10dist(devpi-common) python310-devpi-common python3dist(devpi-common)"
RDEPENDS:${PN} += "python(abi) python310-packaging python310-py python310-requests"

inherit rpm
