SUMMARY = "Collection of protocols modules written in ASN.1 language"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-pyasn1-modules-0.3.0-1.1.noarch.rpm"
RPM_HASH = "7f2c967e7e2f05f699fecef6f8d68c9016edcc83dc71d159e6142660a14d57a317cf6318206e0732e9bdbd5e0c53a492f028db75fed630d7794e2f91e5a8fe8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyasn1-modules) python39-pyasn1-modules python3dist(pyasn1-modules)"
RDEPENDS:${PN} += "python(abi) python39-pyasn1"

inherit rpm
