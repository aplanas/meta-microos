SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-pylint-venv-2.3.0-1.3.noarch.rpm"
RPM_HASH = "965c90916eab08f806c14f8459bff728c3d97ab71ea63ad14db455268aca44d78e024f54c42fa8c5b282b3ca8ab6476b13e1bbc343057b42716077aae1a4e50d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint-venv python3-pylint_venv python3.10dist(pylint-venv) python310-pylint-venv python310-pylint_venv python3dist(pylint-venv)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
