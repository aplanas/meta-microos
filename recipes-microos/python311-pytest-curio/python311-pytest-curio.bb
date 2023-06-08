SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python311-pytest-curio-1.0.1-1.8.noarch.rpm"
RPM_HASH = "8a342b8d82f441633240abc7f5287f45bb295a8677e3b992dc875e7e97403609c5b244cb0df13cf1d172af4e07365f72b4f2b21c760736854a6095cc3e699d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-curio) python311-pytest-curio python3dist(pytest-curio)"
RDEPENDS:${PN} += "python(abi) python311-curio python311-pytest"

inherit rpm
