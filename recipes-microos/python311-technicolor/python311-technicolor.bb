SUMMARY = "Python package for logging in colour"
DESCRIPTION = "Technicolor provides logging in colour and logging of function usage by \
means of a decorator."
LICENSE = "GPL-3.0-only"

PV = "2017.1.16.1544"

RPM_NAME = "python311-technicolor-2017.1.16.1544-3.13.noarch.rpm"
RPM_HASH = "aec0a734f933393432dd7b35c4422e6f301d5fe08bc453001db4c19b457a5761f4edf3e5d3b0bc70945a1a921db5cb2504b9cf69eb0c745b8d6f942c9b372998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(technicolor) \
python311-technicolor \
python3dist(technicolor)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
