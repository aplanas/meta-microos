SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python39-keyrings.alt-4.0.2-1.11.noarch.rpm"
RPM_HASH = "078e8d253fa3508ad40ad1696c5c44394a2a6de6891045673b45614ec2a4e158c92ce9f9a4088b3cc5ef35e95804156748bb9482401938f26033d33d608ee7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(keyrings.alt) python39-keyrings.alt python3dist(keyrings.alt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
