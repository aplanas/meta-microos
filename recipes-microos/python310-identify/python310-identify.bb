SUMMARY = "File identification library for Python"
DESCRIPTION = "File identification library for Python, including license file SPDX identifier."
LICENSE = "MIT"

PV = "2.2.13"

RPM_NAME = "python310-identify-2.2.13-1.9.noarch.rpm"
RPM_HASH = "2d31dd120123f6b01fe95649b86ec4582eac3a85c63b0faeacec32aa188adcd9b073a6b71158caf520264c8acf76eec54ada70350a163d2feffe3e83d8f5f8bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-identify python3.10dist(identify) python310-identify python3dist(identify)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-setuptools update-alternatives"

inherit rpm
