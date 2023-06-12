SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python310-pexpect-4.8.0-10.1.noarch.rpm"
RPM_HASH = "eefdfcb0e0fa411b459ae2e4d44504b0134362c13d7044e29350c87538e1ab3a71629b31a69875ef4d6ae69a22930486f2113495f643e2da650e0ec9c53f4e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pexpect \
python3.10dist(pexpect) \
python310-pexpect \
python3dist(pexpect)"
RDEPENDS:${PN} += "python(abi) \
python310-ptyprocess"

inherit rpm
