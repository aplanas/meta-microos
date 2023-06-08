SUMMARY = "Ansible filters, tests and utility functions for moban users"
DESCRIPTION = "Ansible filters, tests and utility functions for moban users"
LICENSE = "BSD-3-Clause"

PV = "0.0.2"

RPM_NAME = "python311-moban-ansible-0.0.2-2.3.noarch.rpm"
RPM_HASH = "9ce92ad207069685e396b2d952fc0cdf697580f353284001c387e1be230f675475de8db524983e6d0e3cb0d8943dea805c0d36e1401c1838efa6cee6e49ce2c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(moban-ansible) python311-moban-ansible python3dist(moban-ansible)"
RDEPENDS:${PN} += "python(abi) python311-moban"

inherit rpm
