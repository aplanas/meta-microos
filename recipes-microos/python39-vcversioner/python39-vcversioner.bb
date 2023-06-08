SUMMARY = "setup.py extension for deriving versions from SCM tags"
DESCRIPTION = "A setup.py file can be written with no version information \
specified, and vcversioner will find a recent, properly-formatted \
VCS tag and extract a version from it."
LICENSE = "ISC"

PV = "2.16.0.0"

RPM_NAME = "python39-vcversioner-2.16.0.0-4.8.noarch.rpm"
RPM_HASH = "20c05dc3f6272eb54bf38c0e0fcde11403de28b986a6bfb8e76a97996b16dad244751672bf4fabb5aca166db21b88cbcec1e03f0dceb4a98796a357af283def5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vcversioner) python39-vcversioner python3dist(vcversioner)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
