SUMMARY = "hammett is a fast python test runner"
DESCRIPTION = "hammett is a fast python test runner"
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-hammett-0.5.0-1.17.noarch.rpm"
RPM_HASH = "6c6c8cb6e932e91d2006ef96e0244fbff5613af0d3a6a3c04d4cfcb0919e85e61819c6996bb18806a03af00a8f4e413d648ec3f932c9510463c79147da60b4bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hammett python3.10dist(hammett) python310-hammett python3dist(hammett)"
RDEPENDS:${PN} += "python(abi) python310-astunparse python310-colorama"

inherit rpm
