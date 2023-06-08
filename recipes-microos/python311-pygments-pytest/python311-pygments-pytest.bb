SUMMARY = "A pygments lexer for pytest output"
DESCRIPTION = "This library provides a pygments lexer called 'pytest'."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-pygments-pytest-2.3.0-2.1.noarch.rpm"
RPM_HASH = "5bb29b329293da431f57ecee2f4df4059e331df94451b9ce85d2eefe3093b27ce3105c341c1c285b3b05a29a00ae9d6b45a5427f9dc3cfd232874b2702eb7eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pygments-pytest) python311-pygments-pytest python3dist(pygments-pytest)"
RDEPENDS:${PN} += "python(abi) python311-pygments python311-pytest"

inherit rpm
