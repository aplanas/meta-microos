SUMMARY = "Async database support for Python"
DESCRIPTION = "Async database support for Python."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python311-databases-0.6.2-1.4.noarch.rpm"
RPM_HASH = "80ea35dc873af2eb249e3b690871cf77f4c0f882b0ff82a104a4fde8a82a40f0b5edabc63f2a37b5396342f2ba339b4fe283fb5595072992937cb87ebb7d8b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(databases) python311-databases python3dist(databases)"
RDEPENDS:${PN} += "python(abi) python311-sqlalchemy"

inherit rpm
