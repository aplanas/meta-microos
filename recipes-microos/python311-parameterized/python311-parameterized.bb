SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python311-parameterized-0.9.0-1.1.noarch.rpm"
RPM_HASH = "f77b7d60ae5d61d9ffd5c43b8e70524b0af7595e3cda1aae0ddf14f3d8411d68a72435d1ac7b311c1f5b844664b539c41b159f2b297cc3ebb77e0808790a680d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(parameterized) python311-parameterized python3dist(parameterized)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
