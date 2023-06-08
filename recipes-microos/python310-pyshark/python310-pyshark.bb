SUMMARY = "A Python wrapper for tshark output parsing"
DESCRIPTION = "Python wrapper for tshark, allowing python packet parsing using \
wireshark dissectors."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "python310-pyshark-0.4.6-1.5.noarch.rpm"
RPM_HASH = "8970b6a485f3ae0a00af27f47abd9fd66bc9fb82bea709638f116bcaae92b32679eee4509fceb815123ad140f7dbd70632f59534cc0f296a8571a4c230716c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshark python3.10dist(pyshark) python310-pyshark python3dist(pyshark)"
RDEPENDS:${PN} += "python(abi) python310-lxml python310-py wireshark"

inherit rpm
