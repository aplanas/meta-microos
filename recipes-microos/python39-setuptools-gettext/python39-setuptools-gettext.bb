SUMMARY = "Setuptools gettext extension plugin"
DESCRIPTION = "Setuptools gettext extension plugin"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "python39-setuptools-gettext-0.1.1-1.3.noarch.rpm"
RPM_HASH = "a1ccb74f71e1d4d7fde7df3e0778d16efd9c6ae0996b7b92a5b53770d3447e6a4f43cb097af46ba95453317612f2f7a71e9f8700886ada784a919c39e8b71685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools-gettext) python39-setuptools-gettext python3dist(setuptools-gettext)"
RDEPENDS:${PN} += "python(abi) python39-setuptools"

inherit rpm
