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

RPM_NAME = "python310-port-for-0.6.2-1.7.noarch.rpm"
RPM_HASH = "3c5899f4a312cb02cd9fc11d3610353a52ab851c2c3d58d0e8dd66d9807f7ffc2b516e237c49fe5e1b022a82c894ce6bfbc6cfd9a225e5cdbbf8739a769fb976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-port-for python3.10dist(port-for) python310-port-for python3dist(port-for)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
