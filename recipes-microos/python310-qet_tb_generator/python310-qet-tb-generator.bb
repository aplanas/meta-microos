SUMMARY = "Generates terminal blocks & connectors for QElectroTech"
DESCRIPTION = "Allows to generate terminal blocks and connectors for QElectroTech \
electrical diagram software."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "python310-qet_tb_generator-1.3.1-1.4.noarch.rpm"
RPM_HASH = "a0f0afea3b4c49c9e2ae362fe441f07f8f8356b07b02bfb946173d19fb3143449c996948871feb3529ae78c167e2c412cd8824b03d9c16d50394c4e22f32d71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qet_tb_generator python3.10dist(qet-tb-generator) python310-qet_tb_generator python3dist(qet-tb-generator)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-qt5 qelectrotech update-alternatives"

inherit rpm
