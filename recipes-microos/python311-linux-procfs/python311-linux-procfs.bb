SUMMARY = "Linux /proc abstraction classes"
DESCRIPTION = "Abstractions to extract information from the Linux kernel /proc files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "python311-linux-procfs-0.7.1-1.4.noarch.rpm"
RPM_HASH = "e2059ab18339639b8caeae3afc5c89953a2701e0b630c8c2a80477475da1a89a57341b58918e5c577d76932917c26cdeb85a6bfa0232e43ef0a189af36a7ad11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-linux-procfs) python311-linux-procfs python3dist(python-linux-procfs)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-six update-alternatives"

inherit rpm
