SUMMARY = "CLI-tool/Python-library for parsing ping command output"
DESCRIPTION = "pingparsing is a CLI-tool/Python-library for parsing ping command output."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-pingparsing-1.4.0-2.4.noarch.rpm"
RPM_HASH = "83aca726463eb75cb8b897f06c450bfbc7e9cf2b37fb03bf473c75156eaf84e5d4dbf23d18b18f1dd81be752b047df903f94c54183e4daf90ab4a9fd610aa58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pingparsing) python311-pingparsing python3dist(pingparsing)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-humanreadable python311-loguru python311-pyparsing python311-pytz python311-setuptools python311-simplejson python311-subprocrunner python311-typepy update-alternatives"

inherit rpm
