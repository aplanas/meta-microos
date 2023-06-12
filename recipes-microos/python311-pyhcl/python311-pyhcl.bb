SUMMARY = "HCL configuration parser for python"
DESCRIPTION = "HCL configuration parser for python"
LICENSE = "MPL-2.0"

PV = "0.4.4"

RPM_NAME = "python311-pyhcl-0.4.4-2.14.noarch.rpm"
RPM_HASH = "eaa7254e9791e13a8b3df48535ed2f5499de7c1729960757a9367e3836575b440310db7b0528bcf08e8ac1128ed05bf97dcda6da076ee86c67c206c57064f0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyhcl) \
python311-pyhcl \
python3dist(pyhcl)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
