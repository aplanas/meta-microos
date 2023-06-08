SUMMARY = "The Argon2 password hashing algorithm for Python"
DESCRIPTION = "A Python module that uses CFFI to access the Argon2 password hashing \
C library."
LICENSE = "MIT"

PV = "21.3.0"

RPM_NAME = "python310-argon2-cffi-21.3.0-2.2.aarch64.rpm"
RPM_HASH = "256aa43319834e2702ad2b9b9194568dd35a2e3cefc910639f195a0f7b9ec747946b3127c92ee65bf2ad6f8230887fc1387442613fdb0909a1ad6836a4b779cd"

RPROVIDES:${PN} += "python3-argon2-cffi python3-argon2_cffi python3.10dist(argon2-cffi) python310-argon2-cffi python310-argon2-cffi(aarch-64) python310-argon2_cffi python3dist(argon2-cffi)"
RDEPENDS:${PN} += "python(abi) python310-argon2-cffi-bindings"

inherit rpm
