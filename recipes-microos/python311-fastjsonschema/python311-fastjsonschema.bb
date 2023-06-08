SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.16.3"

RPM_NAME = "python311-fastjsonschema-2.16.3-1.2.noarch.rpm"
RPM_HASH = "603a0a28cd2865a4a766a544f6904d97d3a83e405db2aba32122ff3a8d0a130219f226c59c578a7e079c6749a683dfa69721dec55042499e0ba1887d4863c714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fastjsonschema) python311-fastjsonschema python3dist(fastjsonschema)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
