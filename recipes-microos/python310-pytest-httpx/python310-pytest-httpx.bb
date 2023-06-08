SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.21.2"

RPM_NAME = "python310-pytest-httpx-0.21.2-1.3.noarch.rpm"
RPM_HASH = "50c849a0068bdb101022a1602c42a6d2bf5c30d54df1ccb43baac9836a85fff3237cf87109780bb1871efe5ff80778a186decddd383b6735958f376abdc48f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpx python3.10dist(pytest-httpx) python310-pytest-httpx python3dist(pytest-httpx)"
RDEPENDS:${PN} += "python(abi) python310-httpx python310-pytest"

inherit rpm
