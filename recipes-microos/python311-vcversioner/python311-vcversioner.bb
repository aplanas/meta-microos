SUMMARY = "setup.py extension for deriving versions from SCM tags"
DESCRIPTION = "A setup.py file can be written with no version information \
specified, and vcversioner will find a recent, properly-formatted \
VCS tag and extract a version from it."
LICENSE = "ISC"

PV = "2.16.0.0"

RPM_NAME = "python311-vcversioner-2.16.0.0-4.8.noarch.rpm"
RPM_HASH = "7eea27e407602074cc87fdbac306e9ef2eb5da78b01712cc4f4e441030b0d1eff9e7f27217a02808e2acc31366b7f62470b1efb569797d3bb90732137062791b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vcversioner) \
python311-vcversioner \
python3dist(vcversioner)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
