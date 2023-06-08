SUMMARY = "Manager for Python libraries' sample data files"
DESCRIPTION = "Pooch manages sample data files for Python libraries. It automatically \
downloads and stores them in a local directory, with support for versioning \
and checks for corruption."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python310-pooch-1.3.0-2.8.noarch.rpm"
RPM_HASH = "c1ad9012c1d58673d59334f6bebe6b5ca1615dde4c84117203fed5bfc65d5d095470bc44df210107b8b1c72db119fed77d17f7ea5019e8c5210ea9da17c299d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pooch python3.10dist(pooch) python310-pooch python3dist(pooch)"
RDEPENDS:${PN} += "python(abi) python310-appdirs python310-packaging python310-requests"

inherit rpm
