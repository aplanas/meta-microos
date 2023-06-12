SUMMARY = "Data-Driven/Decorated Tests"
DESCRIPTION = "A library to multiply test cases."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-ddt-1.6.0-3.1.noarch.rpm"
RPM_HASH = "17913629b5e6c3c27c89935f050cc1558f349a1d80e0ebb9a4aac5b48401d84dcb800914c8ab26dd194506f69a8c111fd119d1bb706cc5019e69821b00003ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ddt) \
python311-ddt \
python3dist(ddt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
