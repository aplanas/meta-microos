SUMMARY = "Python dependency file parser"
DESCRIPTION = "A parser for Python dependency files."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-dparse-0.6.2-1.3.noarch.rpm"
RPM_HASH = "0c9af6273f3091529632c3ca4072b1caf33561051df480416e0e49809199c5a74c4e93e986c6f7c2e97a9205f71b1e75859819a0d23293abb364c93c745e707d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dparse) python39-dparse python3dist(dparse)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-packaging"

inherit rpm
