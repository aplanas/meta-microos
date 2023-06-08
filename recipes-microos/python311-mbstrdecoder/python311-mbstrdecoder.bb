SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-mbstrdecoder-1.1.1-1.3.noarch.rpm"
RPM_HASH = "dfa0bf187c886565f435789a9373b94893dc55433d086fcdddd325cf769cab18edf046d9b2b0eb9d487d3ec674ee073c7c873a83e32ac697eb214e57fc5f96f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mbstrdecoder) python311-mbstrdecoder python3dist(mbstrdecoder)"
RDEPENDS:${PN} += "python(abi) python311-Faker python311-chardet"

inherit rpm
