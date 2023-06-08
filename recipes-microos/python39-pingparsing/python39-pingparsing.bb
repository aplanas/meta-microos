SUMMARY = "CLI-tool/Python-library for parsing ping command output"
DESCRIPTION = "pingparsing is a CLI-tool/Python-library for parsing ping command output."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-pingparsing-1.4.0-2.4.noarch.rpm"
RPM_HASH = "b671c92bdf040c18ba5cabca8e65239961616e66fc0d0060d1dc8af1f72c73f3bd51f639236282c7735ccc9223b95035f95e9cceb66228dd281e4a13a5a5d9c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pingparsing) python39-pingparsing python3dist(pingparsing)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-humanreadable python39-loguru python39-pyparsing python39-pytz python39-setuptools python39-simplejson python39-subprocrunner python39-typepy update-alternatives"

inherit rpm
