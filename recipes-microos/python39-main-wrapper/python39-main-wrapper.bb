SUMMARY = "Preconfigure Python global environment to run scripts within"
DESCRIPTION = "Set up Python global environment using a wrapper script, and \
then run another script within that environment, ala pdb, profile, etc."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-main-wrapper-0.1.1-1.4.noarch.rpm"
RPM_HASH = "d4583fe77feb9c516024228e8b9ee7c511284b3aab8323480d34dd293a2e20b3c00cb1e92e54ac95903a357175d816c990a1c3c55d885affb881f6c1bd3bed08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(main-wrapper) python39-main-wrapper python3dist(main-wrapper)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-base python39-six update-alternatives"

inherit rpm
