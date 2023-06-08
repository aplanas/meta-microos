SUMMARY = "ARA Records Ansible"
DESCRIPTION = "ARA saves playbook results to a local or remote database by using an \
Ansible callback plugin and provides an API to integrate this data in \
tools and interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.8"

RPM_NAME = "python3-ara-1.5.8-1.4.noarch.rpm"
RPM_HASH = "f9368e530867cdbfd84c749f467059e470aa855dd1a25b3e09f1feca41a0135cbb5cd5f3563c6e579e50fb49aca84a25cec2a7a095d6a368ac91a4145425ea99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ara python3.10dist(ara) python3dist(ara)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-cliff python3-pbr python3-requests update-alternatives"

inherit rpm
