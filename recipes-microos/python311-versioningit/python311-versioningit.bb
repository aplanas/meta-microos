SUMMARY = "Versioning It with your Version In Git"
DESCRIPTION = "Python Setuptools plugin for automatically determining your package's version \
based on your version control repository's tags. Unlike others, it allows easy \
customization of the version format and even lets you easily override the \
separate functions used for version extraction & calculation."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-versioningit-2.2.0-1.4.noarch.rpm"
RPM_HASH = "55786eb6e59379cdd9fe7581f4273f0771f74c8e5a3fb4eb918431dd3fea6bfa83cc29fba9794044c4efb2de17c413831bf1913feab9f0f9c641526448804bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(versioningit) python311-versioningit python3dist(versioningit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi) python311-packaging python311-setuptools python311-tomli"

inherit rpm
