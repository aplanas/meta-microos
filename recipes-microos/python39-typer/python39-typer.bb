SUMMARY = "Typer, build great CLIs. Easy to code. Based on Python type hints"
DESCRIPTION = "Typer is a library for building CLI applications based on Python 3.6+ type hints. \
 \
Based on type hints, Typer enables great editor support and completion for developers. \
With automatic help and completion, Typer makes CLIs easy to use for users. \
 \
This package provides the Typer Python package required to build and run Typer-based CLI applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-typer-0.9.0-1.1.noarch.rpm"
RPM_HASH = "65333c642c6d1818f05c949a87732aa7647f3f733d95c3413493de3ac4135af82e9b7296367b27a076c4e5d15e93ad33123957ca81a28c0cff866c1dc7958ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(typer) python39-typer python3dist(typer)"
RDEPENDS:${PN} += "python(abi) python39-click"

inherit rpm
