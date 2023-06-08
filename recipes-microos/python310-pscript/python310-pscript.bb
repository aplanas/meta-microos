SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python310-pscript-0.7.7-1.4.noarch.rpm"
RPM_HASH = "af9bf9343b71819f9da27a76e50c84aae288bdaaa0e9f93093eb3fe5dbac8d8ac5b3e87e52a65d6063ca7720bec59d0331c2b8ea4c7322cc423d7d5e652f91b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pscript python3.10dist(pscript) python310-pscript python3dist(pscript)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
