SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python311-check-manifest-0.49-2.2.noarch.rpm"
RPM_HASH = "66fb8564e58e637ad4c092587427231968c68eca81ae0b0c94e4c11acd2652172f7c8a5033b6eedee2f2f58c489b794a41a96ac7dc50cd3b750840a8f1a43934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(check-manifest) python311-check-manifest python3dist(check-manifest)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-build python311-setuptools python311-toml update-alternatives"

inherit rpm
