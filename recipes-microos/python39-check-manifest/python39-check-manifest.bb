SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python39-check-manifest-0.49-2.2.noarch.rpm"
RPM_HASH = "ea2b13c2bffa96ca0ff783f1d5a635a26c5885d36dcae43f2290ce6341b5a1ead6f9837f8388f0fc886b768014158f45a69e5ac0ce4993ef2450fc9484c865d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(check-manifest) python39-check-manifest python3dist(check-manifest)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-build python39-setuptools python39-toml update-alternatives"

inherit rpm
