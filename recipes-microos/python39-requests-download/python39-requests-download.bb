SUMMARY = "Python module to download and save files using python-requests"
DESCRIPTION = "This module downloads files using requests and saves them to a target path."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-requests-download-0.1.2-2.14.noarch.rpm"
RPM_HASH = "53504caa4153cb35af4d9cf8bd66218f650ca6f4442aaf24a86a69ea81e0bed14d983452e1ed161af5f84933fbff2f0176f9b83e47951310b3156c39dac0f053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-download) python39-requests-download python3dist(requests-download)"
RDEPENDS:${PN} += "python(abi) python39-progressbar python39-requests"

inherit rpm
