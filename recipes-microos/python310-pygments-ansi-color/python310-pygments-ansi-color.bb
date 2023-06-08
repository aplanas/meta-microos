SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-pygments-ansi-color-0.1.0-2.1.noarch.rpm"
RPM_HASH = "aaa9e0a4697a165212dfe32b5059fc009598ce7bc897438685645ae5266545f3537a5b2ffe884cea140ca3b8bdf5e601d3f79f846bb7637f29b4b06782fd5d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-ansi-color python3.10dist(pygments-ansi-color) python310-pygments-ansi-color python3dist(pygments-ansi-color)"
RDEPENDS:${PN} += "python(abi) python310-pygments python310-setuptools"

inherit rpm
