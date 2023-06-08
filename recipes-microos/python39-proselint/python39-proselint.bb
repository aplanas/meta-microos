SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python39-proselint-0.13.0-2.4.noarch.rpm"
RPM_HASH = "c968ad4fbd9206b5b25aa54908f2d106b59617bb7cb783b70b3cc5cf73a876fa322a3364209e10ad1507f585f044cbece96cb9b93b07f7b6a3d472ab2939ee43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(proselint) python39-proselint python3dist(proselint)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-dbm python39-future update-alternatives"

inherit rpm
