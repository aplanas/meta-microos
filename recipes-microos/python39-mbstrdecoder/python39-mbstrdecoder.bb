SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-mbstrdecoder-1.1.2-1.1.noarch.rpm"
RPM_HASH = "e9b2eb049a8edca9f8c95599864dc53eab2390599e211bca3074bf821616279841927fbcc2171ab8be6d190a0855f3edc55e4237f8011b2057bd366dfb2c3cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mbstrdecoder) python39-mbstrdecoder python3dist(mbstrdecoder)"
RDEPENDS:${PN} += "python(abi) python39-Faker python39-chardet"

inherit rpm
