SUMMARY = "A lexer and codec to work with LaTeX code in Python"
DESCRIPTION = "A lexer and codec to work with LaTeX code in Python."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-latexcodec-2.0.1-3.2.noarch.rpm"
RPM_HASH = "66643ed8f011e4cea87fd2ef21077c76a1f82d1b8bf67e7525423a3127c028c25d42afc9890de4fe144a9e7e0aa0a341da75f3da1b2723f59400a55fd927dcf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-latexcodec python3.10dist(latexcodec) python310-latexcodec python3dist(latexcodec)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
