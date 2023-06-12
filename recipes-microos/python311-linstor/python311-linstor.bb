SUMMARY = "Python API for Linstor"
DESCRIPTION = "A Python API for Linstor."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python311-linstor-1.12.0-1.6.aarch64.rpm"
RPM_HASH = "bfcdd53bf5764e5b93997f4f217a78be7d4e8978d42ccd72cf9eb89f79cf97c1598ff9c93b6bc7afef237ea8bd8aefebecedb3f955828d8a87ff56ddb9e44250"

RPROVIDES:${PN} += "python3.11dist(python-linstor) \
python311-linstor \
python311-linstor(aarch-64) \
python3dist(python-linstor)"
RDEPENDS:${PN} += "python(abi) \
python311-protobuf"

inherit rpm
