SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library to automatically do a bunch of standard \
things you want in your setup.py without you having to repeat \
them every time. It will set versions, process requirements \
files and generate AUTHORS and ChangeLog file all from git \
information."
LICENSE = "Apache-2.0"

PV = "5.11.1"

RPM_NAME = "python310-pbr-5.11.1-4.1.noarch.rpm"
RPM_HASH = "937d047a743ad7feb54ba06b596964670295f372ba2a14f11cb8df0ab03b639570d60415d97e439fd2765da756358be30ce6c85b1754b903d82cd156fecfa661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pbr python3.10dist(pbr) python310-pbr python3dist(pbr)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-setuptools update-alternatives"

inherit rpm
