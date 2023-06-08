SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.28.1"

RPM_NAME = "python311-referencing-0.28.1-2.1.noarch.rpm"
RPM_HASH = "a552eed1800fe7f1bcc09985dc42a8580f5b9e6de9ff39fded61815baff5223ab422fdc2d79ee33202fcb262e570c1deefe582c9b058ecf99d928590150f1f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(referencing) python311-referencing python3dist(referencing)"
RDEPENDS:${PN} += "python(abi) python311-attrs python311-rpds-py"

inherit rpm
