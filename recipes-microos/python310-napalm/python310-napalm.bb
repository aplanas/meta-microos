SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python310-napalm-4.0.0-2.4.noarch.rpm"
RPM_HASH = "207a5fd485e6b057a4bd621d602e7432c9e26c294d5eec2a3ca4570b351326fc5d426e0f3b54ef34f58efa85fedc26098e1a83dfc08d30f0971c8729162df563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm \
python3.10dist(napalm) \
python310-napalm \
python3dist(napalm)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Jinja2 \
python310-PyYAML \
python310-cffi \
python310-ciscoconfparse \
python310-future \
python310-junos-eznc \
python310-lxml \
python310-ncclient \
python310-netaddr \
python310-netmiko \
python310-netutils \
python310-paramiko \
python310-pyeapi \
python310-requests \
python310-scp \
python310-setuptools \
python310-textfsm \
python310-ttp \
python310-ttp-templates \
python310-typing_extensions \
update-alternatives"

inherit rpm
