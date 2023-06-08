SUMMARY = "Coverage checking using https://coveralls.io/"
DESCRIPTION = "A helper to check https://coveralls.io for a given commit hash."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-coveralls-check-1.2.1-3.8.noarch.rpm"
RPM_HASH = "95e32f6438826a06d568c1df08acde2eb6fbe6c085db7c8e75f168e1838cbcfa45ffdaafe439992117f94261ba90494bd34aa09183907b0f1a0965e4b78a6a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(coveralls-check) python39-coveralls-check python3dist(coveralls-check)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-backoff python39-requests python39-setuptools update-alternatives"

inherit rpm
