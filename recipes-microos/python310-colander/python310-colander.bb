SUMMARY = "A schema-based serialization and deserialization library"
DESCRIPTION = "An extensible package which can be used to: \
 \
- deserialize and validate a data structure composed of strings, \
  mappings, and lists. \
 \
- serialize an arbitrary data structure to a data structure composed \
  of strings, mappings, and lists."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "1.7.0"

RPM_NAME = "python310-colander-1.7.0-5.12.noarch.rpm"
RPM_HASH = "c09b885c116e41e6567eed40e20a4712edadf2717a928257fad04358a184d9227426b8a57aad432cbb595a44e1b07a42f6a9104066581c49432858867b99cc62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colander python3.10dist(colander) python310-colander python3dist(colander)"
RDEPENDS:${PN} += "python(abi) python310-iso8601 python310-translationstring"

inherit rpm
