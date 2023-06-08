SUMMARY = "Manager for Python libraries' sample data files"
DESCRIPTION = "Pooch manages sample data files for Python libraries. It automatically \
downloads and stores them in a local directory, with support for versioning \
and checks for corruption."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python311-pooch-1.3.0-2.8.noarch.rpm"
RPM_HASH = "24b8e8b347c258090e9be9a0b564c5c245546273de48a7b19f7d4501b6b55cf358f3920f8fc3c0e8a0e8d8b32b845d3763d801a374484ff2521ef3b43a2bcd26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pooch) python311-pooch python3dist(pooch)"
RDEPENDS:${PN} += "python(abi) python311-appdirs python311-packaging python311-requests"

inherit rpm
