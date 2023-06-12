SUMMARY = "Library with helpers for the jsonlines file format"
DESCRIPTION = "Python library to simplify working with jsonlines_ and ndjson_ data."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python311-jsonlines-3.1.0-1.3.noarch.rpm"
RPM_HASH = "7ed1fa80adc82235ddb90d695909b7861180244ff2d8d13a21624ef301b1b14eca30345eef29d9d561dd6821ba80fc8058dd1bfc98b651081a74446503996623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonlines) \
python311-jsonlines \
python3dist(jsonlines)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
