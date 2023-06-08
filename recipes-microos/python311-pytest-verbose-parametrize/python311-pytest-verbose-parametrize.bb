SUMMARY = "More descriptive output for parametrized pytest tests"
DESCRIPTION = "More descriptive output for parametrized py.test tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-verbose-parametrize-1.7.0-6.3.noarch.rpm"
RPM_HASH = "ba5098110b53729d7397fed6d063d50cda233dd56e3e48858f2129fab7a85f907c88a767be4ef40eb088587d4e5476e9ab1e1f135693183b54445b9c2798c7c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-verbose-parametrize) python311-pytest-verbose-parametrize python3dist(pytest-verbose-parametrize)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
