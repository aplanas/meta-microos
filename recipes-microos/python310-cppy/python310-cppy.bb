SUMMARY = "C++ headers for C extension development"
DESCRIPTION = "C++ headers for C extension development"
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-cppy-1.2.1-2.1.noarch.rpm"
RPM_HASH = "decb803d3747cd7d3a952fd891ef9b2c5157c8b691c8485c3aff1472becccd66960048df08b2a41377d919ab7bf4abf4bb739c541ca4c61be8d3a0a07d12acb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cppy python3.10dist(cppy) python310-cppy python3dist(cppy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
