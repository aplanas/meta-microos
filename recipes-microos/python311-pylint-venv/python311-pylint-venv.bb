SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-pylint-venv-2.3.0-1.3.noarch.rpm"
RPM_HASH = "a1c22f98d2dac1afe1c20d8faea2759ebc389675838bbcaaf43d634db8397565e3fb3f5676a5031a63df7182bef525dd9a5c441bf25685ad8371fca7fc2c8c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylint-venv) python311-pylint-venv python311-pylint_venv python3dist(pylint-venv)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
