SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "python311-Glances-3.3.1-1.1.noarch.rpm"
RPM_HASH = "78fb4fd0b8aee840ad505d56f986583dc927f59b2237fb0227ad3967935bc4fd7d8b9f4778e179d96d580cddcf8ac1878e3efd465bc2952f2ad140b0e9201789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances \
python3.11dist(glances) \
python311-Glances \
python311-glances \
python3dist(glances)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-bottle \
python311-defusedxml \
python311-future \
python311-psutil \
python311-requests \
python311-ujson \
update-alternatives"

inherit rpm
