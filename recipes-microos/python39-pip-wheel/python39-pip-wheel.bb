SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python39-pip-wheel-22.3.1-2.1.noarch.rpm"
RPM_HASH = "81214d70bdb20fa932cffb09227d2bb4f81a07c1c8988ce6028b852a7d73ce2a5a78d41599edc881bb2770f39a58308755a864ec4ffc9aefbebfe4865bffa3c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pip-wheel"
RDEPENDS:${PN} += "/bin/sh alts ca-certificates coreutils python39-setuptools python39-xml"

inherit rpm
