SUMMARY = "The Linode command-line interface"
DESCRIPTION = "The Linode Command Line interface"
LICENSE = "BSD-3-Clause"

PV = "5.25.0"

RPM_NAME = "python39-linode-cli-5.25.0-1.4.aarch64.rpm"
RPM_HASH = "2484dccf192a1dadc20829fea6622a122e180ddd55333a712f2508664004b9489d6c79d7cc1922387c37c43eb4ded8bcb65d854b9fcad93160b1f8554b022a53"

RPROVIDES:${PN} += "python3.9dist(linode-cli) \
python39-linode-cli \
python39-linode-cli(aarch-64) \
python3dist(linode-cli)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-requests \
python39-terminaltables \
update-alternatives"

inherit rpm
