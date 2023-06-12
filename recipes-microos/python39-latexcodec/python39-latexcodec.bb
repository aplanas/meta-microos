SUMMARY = "A lexer and codec to work with LaTeX code in Python"
DESCRIPTION = "A lexer and codec to work with LaTeX code in Python."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-latexcodec-2.0.1-3.2.noarch.rpm"
RPM_HASH = "adb68db58ef953ebf3c5ebaf19c205d017b84b32005a5780815fcd5ca7e92470cea15a4e179131750258bd7c4918f200440dfe46da1eb48819d3c3496b818e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(latexcodec) \
python39-latexcodec \
python3dist(latexcodec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
