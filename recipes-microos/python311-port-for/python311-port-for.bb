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

RPM_NAME = "python311-port-for-0.6.2-1.7.noarch.rpm"
RPM_HASH = "7270d8324efc6ecca0ef853a35cc8549fcf7b2d1d3c2f912074e7c6c3f856ed40decfca2b3c2a7ba297fefcf1de224046f0a5a2b5b20c5ad0fc90fba9d61e6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(port-for) python311-port-for python3dist(port-for)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
