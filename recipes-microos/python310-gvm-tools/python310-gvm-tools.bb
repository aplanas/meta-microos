SUMMARY = "Tools to control a GSM/GVM over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Tools gvm-tools are a collection \
of tools that help with remote controlling a Greenbone Security Manager \
(GSM) appliance and its underlying Greenbone Vulnerability Manager (GVM). \
The tools aid in accessing the communication protocols GMP (Greenbone \
Management Protocol) and OSP (Open Scanner Protocol). \
 \
This module is comprised of interactive and non-interactive clients. \
The programming language Python is supported directly for interactive \
scripting. But it is also possible to issue remote GMP/OSP commands \
without programming in Python."
LICENSE = "GPL-3.0-or-later"

PV = "23.2.0"

RPM_NAME = "python310-gvm-tools-23.2.0-1.2.noarch.rpm"
RPM_HASH = "0ee2f9ed5f177157c796a357f5c4e0eba981d2ebb592e1b870b2e1cf852548b30a378edb638697d4e4e0728290d0b265f95a61fc1858d813699243effc74536b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gvm-tools \
python3.10dist(gvm-tools) \
python310-gvm-tools \
python3dist(gvm-tools)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-python-gvm \
update-alternatives"

inherit rpm
