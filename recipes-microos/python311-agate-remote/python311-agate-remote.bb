SUMMARY = "Read support for remote files for agate"
DESCRIPTION = "Agate-remote adds read support for remote files to agate."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-agate-remote-0.2.1-1.3.noarch.rpm"
RPM_HASH = "378e54d8d06b446819829695c768afa40b57741e89c5db25cbe8a42fba0dd5a541ec6ced57a8cc705a5233cb8ed3eb37a786798013632f588163c4dbefbe992a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(agate-remote) python311-agate-remote python3dist(agate-remote)"
RDEPENDS:${PN} += "python(abi) python311-agate python311-requests"

inherit rpm
