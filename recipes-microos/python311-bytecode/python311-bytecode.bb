SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python311-bytecode-0.14.1-1.1.noarch.rpm"
RPM_HASH = "8cf2348bab3935305affe8ab220d21add60f01b7a2f54a72619a1a4ab89e70f619d9d33a1d6f00b9bbd85f68f11537c590f55a01bae4a41dd5fd3e7bc30898c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bytecode) python311-bytecode python3dist(bytecode)"
RDEPENDS:${PN} += "(python311-typing-extensions if python311-base < 3.10) python(abi)"

inherit rpm
