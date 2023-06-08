SUMMARY = "C++ headers for C extension development"
DESCRIPTION = "C++ headers for C extension development"
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-cppy-1.2.1-2.1.noarch.rpm"
RPM_HASH = "931315388b0679c955f660d8708bb39cc08034ad433de9b65d2d44952f0363228d348e16a4c2ddbc16a04f188b324b96e7e6354b50f176317d0b5fffa5b4f517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cppy) python311-cppy python3dist(cppy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
