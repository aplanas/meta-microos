SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-mbstrdecoder-1.1.1-1.3.noarch.rpm"
RPM_HASH = "aee39f7af024859f9e1d0c104d1d524036237a82fa84b39c65e73aa276baa08f02c800ad6257f59ad206e7db89df299f749fad198844b1e333b3a50489c2caf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mbstrdecoder) python39-mbstrdecoder python3dist(mbstrdecoder)"
RDEPENDS:${PN} += "python(abi) python39-Faker python39-chardet"

inherit rpm
