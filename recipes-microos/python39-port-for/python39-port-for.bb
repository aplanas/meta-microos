SUMMARY = "Utility that helps with local TCP ports managment"
DESCRIPTION = "port-for is a command-line utility and a python library that \
helps with local TCP ports management. \
 \
It can find an unused TCP localhost port and remember the association:: \
 \
    $ sudo port-for foo \
    37987 \
 \
This can be useful when you are installing a stack of software \
with multiple parts needing port numbers. \
 \
There are several rules port-for is trying to follow to find and \
return a new unused port: \
 \
1) Port must be unused: port-for checks this by trying to connect \
   to the port and to bind to it. \
 \
2) Port must be IANA unassigned and otherwise not well-known: \
   this is acheived by maintaining unassigned ports list \
   (parsed from IANA and Wikipedia). \
 \
3) Port shouldn't be inside ephemeral port range. \
   This is important because ports from ephemeral port range can \
   be assigned temporary by OS (e.g. by machine's IP stack) and \
   this may prevent service restart in some circumstances. \
   ``port-for`` doesn't return ports from ephemeral port ranges \
   configured at the current machine. \
 \
4) Other heuristics are also applied: ``port-for`` tries to return \
   a port from larger port ranges; it also doesn't return ports that are \
   too close to well-known ports."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-port-for-0.6.2-1.7.noarch.rpm"
RPM_HASH = "65a3c2efd1772681a05b6ca0b8069755bf2d4e36d389e0ada5569420f08319ae437ccd977ddc9f2d728332dc16d7acc1a8e2a2c9a1c22b23a6e29c3adc3e2b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(port-for) python39-port-for python3dist(port-for)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
