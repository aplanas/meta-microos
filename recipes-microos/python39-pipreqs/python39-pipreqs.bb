SUMMARY = "Pip requirements generator based on imports in project"
DESCRIPTION = "Pip requirements.txt generator based on imports in project."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python39-pipreqs-0.4.10-2.13.noarch.rpm"
RPM_HASH = "4a330fd922d2c97852708c97235a555bc97f4b572560389d1673f53c06978a3f92ad993ff95debb4833d27bfb259b0d88154f49641581ac58330e0958c8e169f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pipreqs) \
python39-pipreqs \
python3dist(pipreqs)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-docopt \
python39-setuptools \
python39-yarg \
update-alternatives"

inherit rpm
