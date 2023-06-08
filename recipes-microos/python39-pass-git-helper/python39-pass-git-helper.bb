SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0+"

PV = "1.2.0"

RPM_NAME = "python39-pass-git-helper-1.2.0-1.4.noarch.rpm"
RPM_HASH = "bcb02b624ad1ec9ee73ce62f8d99dce74306d665556ff0e158794d91cb8c0ca93328d22b0af38e118fc9668ec46a5c4f2908e5b559b1d62ac59c5ae71c24ae8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pass-git-helper) python39-pass-git-helper python3dist(pass-git-helper)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-pyxdg update-alternatives"

inherit rpm
