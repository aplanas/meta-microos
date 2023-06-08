SUMMARY = "URI parsing, classification and composition"
DESCRIPTION = "URI parsing, classification and composition."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-uritools-4.0.0-1.3.noarch.rpm"
RPM_HASH = "e1809b7643f42d1786c7fc32e555ec2a26d67ded64e6cb29d66ed13b0955a5c6c0f312a413907adf9f363eb1ae05a18a1b326b011053c8c4b67a5aad4af34796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(uritools) python39-uritools python3dist(uritools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
