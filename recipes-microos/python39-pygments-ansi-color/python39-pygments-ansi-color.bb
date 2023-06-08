SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-pygments-ansi-color-0.1.0-2.1.noarch.rpm"
RPM_HASH = "d8ddb1a8b99234dbc130bbd3f451b295f9b2a1780c7821f9e4a7603b7d4052256caf870c2ba05af334c906a78640aebcd55a16049d024b8ac103cab362516689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pygments-ansi-color) python39-pygments-ansi-color python3dist(pygments-ansi-color)"
RDEPENDS:${PN} += "python(abi) python39-pygments python39-setuptools"

inherit rpm
