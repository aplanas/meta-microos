SUMMARY = "Mypy static type checker plugin for Pytest"
DESCRIPTION = "Mypy static type checker plugin for Pytest."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python311-pytest-mypy-0.10.3-1.3.noarch.rpm"
RPM_HASH = "c25a40669272b281dc856c5d18992641d9c5fed0e2fa61d2cb06ab01ff642500422e46d4ee4ec0f1c35eba160cb4c03c42c3fc408fe389c951a35da1b8fda38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-mypy) python311-pytest-mypy python3dist(pytest-mypy)"
RDEPENDS:${PN} += "python(abi) python311-attrs python311-filelock python311-mypy python311-pytest"

inherit rpm
