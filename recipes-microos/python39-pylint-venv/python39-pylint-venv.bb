SUMMARY = "Use the same Pylint installation with different virtual environments"
DESCRIPTION = "pylint-venv provides a Pylint init-hook to use the same Pylint installation with different virtual environments."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-pylint-venv-2.3.0-1.3.noarch.rpm"
RPM_HASH = "f26fdeca62eeee629936c276208eaa63ece44e906750a5fa185871a905f8f9ddd7851645753125d856b0e9ffd4930995af214f93735386a472b57d387b6d8c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylint-venv) python39-pylint-venv python39-pylint_venv python3dist(pylint-venv)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
