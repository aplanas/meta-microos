SUMMARY = "Authorize SSH public keys from online identities"
DESCRIPTION = "A command-line utility that imports SSH public keys to your authorized_keys \
file from online services like GitHub and Launchpad."
LICENSE = "GPL-3.0"

PV = "5.11"

RPM_NAME = "ssh-import-id-5.11-1.6.noarch.rpm"
RPM_HASH = "96b94b8f283ed5c9f84a8dcd0c33f5ecdaba466c89772a403e90b6f2a87757bb84e1b805b347bd29a02dbe5a1b237e1c7bbecf599d414c75eb33bccbc2e6965c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(ssh-import-id) \
python3dist(ssh-import-id) \
ssh-import-id"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
openssh-common \
python(abi) \
python3.10dist(distro) \
python3.10dist(setuptools)"

inherit rpm
