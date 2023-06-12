SUMMARY = "Common files for the DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "Configuration files for the DMTF Cloud Audit (CADF) data model."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python-pycadf-common-3.1.1-2.5.noarch.rpm"
RPM_HASH = "ed2f197d0d407aa6faa906ecf435b2e4f8dbab05e5140d2d6f0a20d20b6033a41840843ce00efcfa55ca7baa14d61c7ab775c2e00281b8aa7c8ce61a55399e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python-pycadf-common) \
python-pycadf-common"
RDEPENDS:${PN} += ""

inherit rpm
