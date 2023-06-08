SUMMARY = "Pure-Python Implementation of the AES block-cipher"
DESCRIPTION = "A pure-Python implementation of the AES (FIPS-197) block-cipher algorithm \
and common modes of operation (CBC, CFB, CTR, ECB, OFB) with no dependencies \
beyond standard Python libraries. See README.md for API reference and details."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python311-pyaes-1.6.1-3.4.noarch.rpm"
RPM_HASH = "d86410e3864be7fb7bde2766289ae55f345ed834bac3692a5c0d66489871d32d16fe77615edb2bb985465083e10e5315e9ee40db860ce59d30c877898b6017c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyaes) python311-pyaes python3dist(pyaes)"
RDEPENDS:${PN} += "python(abi) python311-pycryptodome"

inherit rpm
