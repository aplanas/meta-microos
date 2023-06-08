SUMMARY = "Pure-Python Implementation of the AES block-cipher"
DESCRIPTION = "A pure-Python implementation of the AES (FIPS-197) block-cipher algorithm \
and common modes of operation (CBC, CFB, CTR, ECB, OFB) with no dependencies \
beyond standard Python libraries. See README.md for API reference and details."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python310-pyaes-1.6.1-3.4.noarch.rpm"
RPM_HASH = "da5c4a5e3b7134589d2eb8d136072e85edf2c4359f7ecb519464083f066e7d1d98b4bbe7b099a3d363ba68f1d2ece0219d18a2dd076a6331d736b0e0f03f2902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyaes python3.10dist(pyaes) python310-pyaes python3dist(pyaes)"
RDEPENDS:${PN} += "python(abi) python310-pycryptodome"

inherit rpm
