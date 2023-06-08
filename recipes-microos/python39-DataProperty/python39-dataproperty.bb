SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.0"

RPM_NAME = "python39-DataProperty-0.55.0-2.3.noarch.rpm"
RPM_HASH = "b8f928277d98cb30c8cde31610023ce8c9825bb27cb3849a009477d5fa410ff6fccd0caef38ef90e0fb46b76e5079ae2c2b89ec2d888916999c0f3214b44bf07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dataproperty) python39-DataProperty python3dist(dataproperty)"
RDEPENDS:${PN} += "python(abi) python39-mbstrdecoder python39-typepy"

inherit rpm
