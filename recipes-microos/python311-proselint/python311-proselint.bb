SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python311-proselint-0.13.0-2.4.noarch.rpm"
RPM_HASH = "9e496884cd6a15907d131fb9bf1ba1df6e3d4fc7489942a6fce5dcea0eed4850091167013c93fed856caaa8e6b482d2e3fc1edfb1957a3f75d990ac089efa61e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(proselint) \
python311-proselint \
python3dist(proselint)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-click \
python311-dbm \
python311-future \
update-alternatives"

inherit rpm
