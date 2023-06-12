SUMMARY = "Command line utility to show dependency tree of packages"
DESCRIPTION = "Command line utility to show dependency tree of packages."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python310-pipdeptree-2.7.1-1.1.noarch.rpm"
RPM_HASH = "5109fca718a7db4dc22de8a60933026d3488889fb1f4b4524817d35943d2636aa0660a96259a29b0dd00664a27649758dc0a277aac69d8d94a456154473d1c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipdeptree \
python3.10dist(pipdeptree) \
python310-pipdeptree \
python3dist(pipdeptree)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-pip \
update-alternatives"

inherit rpm
