SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python311-virtue-2.5.2-2.1.noarch.rpm"
RPM_HASH = "71ae45dd01ec814f8f712d22472d5f3535a235b5dd27b62b3b39930ffda8136c77892c12fe57ef3ac8afb62287df7bf7e14805507e12bf7afde6bb8b522dd9fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(virtue) python311-virtue python3dist(virtue)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Twisted python311-attrs python311-click python311-colorama python311-pyrsistent update-alternatives"

inherit rpm
