SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python311-flit-3.8.0-5.1.noarch.rpm"
RPM_HASH = "17f4b97ba8f323c5de591d18d6aee7995e59561681f11bb945c16e16e07472b42358bcf4ea69b51931814e186aa86a21658aa91842b955d7eef4f272c1064a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flit) \
python311-flit \
python3dist(flit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-docutils \
python311-flit-core \
python311-requests \
python311-tomli-w \
update-alternatives"

inherit rpm
