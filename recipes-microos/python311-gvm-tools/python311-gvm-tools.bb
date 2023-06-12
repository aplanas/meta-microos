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

RPM_NAME = "python311-gvm-tools-23.2.0-1.2.noarch.rpm"
RPM_HASH = "73a422d8f2a1e5ed2c8031fe6b43f8a75e9d6b23e82ba727a32ef61bc81867ae9dd429aa793773779dd707262ff885a48141fbbf365955fddbcf71c7e5272e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gvm-tools) \
python311-gvm-tools \
python3dist(gvm-tools)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-python-gvm \
update-alternatives"

inherit rpm
