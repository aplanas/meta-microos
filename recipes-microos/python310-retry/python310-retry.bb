SUMMARY = "Python retry decorator"
DESCRIPTION = "Easy to use retry decorator."
LICENSE = "Apache-2.0"

PV = "0.9.2"

RPM_NAME = "python310-retry-0.9.2-3.6.noarch.rpm"
RPM_HASH = "7dd453df6590580a19b77fd1f5a2b9196fe25ea7eb1bcdd8171625a6d55d36e9729297f9447c5fb5cb4518f383a0481a4dc4dc34c915b47de05e43e5b9a67723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retry python3.10dist(retry) python310-retry python3dist(retry)"
RDEPENDS:${PN} += "python(abi) python310-decorator python310-py"

inherit rpm
