SUMMARY = "RElease NOtes manager"
DESCRIPTION = "Reno is a release notes manager for storing release notes in a git \
repository and then building documentation from them."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python3-reno-3.5.0-1.7.noarch.rpm"
RPM_HASH = "a042d8a7c373af20a90ae21e1e6d414b25a6d7cb94acf714c932911b22169713836f8d382ddc9cc920f1af12575f877769b520c3233307e6074026eec88e6831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reno python3.10dist(reno) python3dist(reno)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-PyYAML python3-Sphinx python3-docutils python3-dulwich python3-pbr python3-six update-alternatives"

inherit rpm
