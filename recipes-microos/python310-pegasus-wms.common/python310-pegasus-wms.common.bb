SUMMARY = "Pegasus Workflow Management System Python Commons"
DESCRIPTION = "This package contains common files for the Python APIs for Pegasus WMS."
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python310-pegasus-wms.common-5.0.3-2.3.noarch.rpm"
RPM_HASH = "d87d37a3d0a55194d5b6ea7bb876e21546ff1f410228a2fb8efcc1c7f1f4f43aa999350fe8085b02ba1658cad197cf2c7bcffcf2af0884ac78098586140d8b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegasus-wms.common python3.10dist(pegasus-wms.common) python310-pegasus-wms.common python3dist(pegasus-wms.common)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML"

inherit rpm
