SUMMARY = "Python Data Validation"
DESCRIPTION = "Python Data Validation for Humans."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python311-validators-0.20.0-3.1.noarch.rpm"
RPM_HASH = "4afd05fdd1eeab3dcf8cc94658c5b75256938c8930b74e690049be8ad56eefa6229e728687fe0b36f30a273b56ad3a4aaf8e0dc36a0829df5793a321b6cc3764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(validators) \
python311-validators \
python3dist(validators)"
RDEPENDS:${PN} += "python(abi) \
python311-decorator"

inherit rpm
