SUMMARY = "Generic test automation framework for acceptance testing and ATDD"
DESCRIPTION = "Robot Framework is a generic open source automation framework for acceptance testing, acceptance \
test driven development (ATDD), and robotic process automation (RPA). It has simple plain text \
syntax and it can be extended easily with libraries implemented using Python or Java."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "python310-robotframework-6.0.1-1.4.noarch.rpm"
RPM_HASH = "f4a9d3fef1130751e2bbfd51b4c7b95c70521589d7d725dbc3f6271ff342636bf0dbc8d0114985bd092959c421ac5a55da88b3ad4a05b02d8bcec5b3610717ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-robotframework python3.10dist(robotframework) python310-robotframework python3dist(robotframework)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-setuptools update-alternatives"

inherit rpm
