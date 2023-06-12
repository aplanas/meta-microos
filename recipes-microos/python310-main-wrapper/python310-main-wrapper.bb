SUMMARY = "Preconfigure Python global environment to run scripts within"
DESCRIPTION = "Set up Python global environment using a wrapper script, and \
then run another script within that environment, ala pdb, profile, etc."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-main-wrapper-0.1.1-1.4.noarch.rpm"
RPM_HASH = "57e84c84f192ce198308fca6a28d9a48c26be2b48352068bdb79adffe022f8e2c53de00726f3573d620806f56d8c8b22ff6368e2f0b26650c5ffc4e6883f989a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-main-wrapper \
python3.10dist(main-wrapper) \
python310-main-wrapper \
python3dist(main-wrapper)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-base \
python310-six \
update-alternatives"

inherit rpm
