SUMMARY = "Python 2 / 3 compatibility, like six, but favouring Python 3"
DESCRIPTION = "python-nine is python-six 'turned around': whereas python-six used \
to make python2 idioms work in python3, python-nine makes python3 \
idioms work in python2."
LICENSE = "SUSE-Public-Domain"

PV = "1.1.0"

RPM_NAME = "python310-nine-1.1.0-1.13.noarch.rpm"
RPM_HASH = "d6273959d6ad2c72a74c40672c60a0772b802d848dcd4b2bfdae904cf6f45f39aad037809c691d5b28e07bb89cf8d60d86fa5707e3a4699fd10f5b8603ffd182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nine python3.10dist(nine) python310-nine python3dist(nine)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
