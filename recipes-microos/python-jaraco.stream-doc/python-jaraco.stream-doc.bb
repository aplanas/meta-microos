SUMMARY = "Documentation files for python-jaraco.stream"
DESCRIPTION = "This package contains documentation files for python-jaraco.stream."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python-jaraco.stream-doc-3.0.3-2.1.noarch.rpm"
RPM_HASH = "22436aeab8562180ddd5bc27988b5c5575152cbf1b96ba4c02b9a59260b2cf4fd18ee4ecaabfedf0f2a871c13c77d4467ced9e90d24e2ca29e7be7e4277ad0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-jaraco.stream-doc \
python310-jaraco.stream-doc \
python311-jaraco.stream-doc \
python39-jaraco.stream-doc"
RDEPENDS:${PN} += ""

inherit rpm
