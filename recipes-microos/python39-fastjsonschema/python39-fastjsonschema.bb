SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.16.3"

RPM_NAME = "python39-fastjsonschema-2.16.3-1.2.noarch.rpm"
RPM_HASH = "3a28b5a76a6cf765817d82134ff38906d729b8d0dd644bc900a7108d2790f3f845a60854aa1e668e6d7ab1b1305fc268d841bb464b85888df317108a91aa2534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fastjsonschema) python39-fastjsonschema python3dist(fastjsonschema)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
