SUMMARY = "Python's filesystem abstraction layer"
DESCRIPTION = "PyFilesystem is an abstraction layer for filesystems. In the same way that \
Python's file-like objects provide a common way of accessing files, \
PyFilesystem provides a common way of accessing entire filesystems. You can \
write platform-independent code to work with local files, that also works with \
any of the supported filesystems (zip, ftp, S3 etc.)."
LICENSE = "MIT"

PV = "2.4.16"

RPM_NAME = "python39-fs-2.4.16-2.1.noarch.rpm"
RPM_HASH = "18915b3eff00e92389d75971ab284751ed9a28fea02c6e74b9e4e5a01657fdd105f348f0a970dfba1eb4dbd1454f4286eef2e38c02382d13d28aeb5acee77f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fs) python39-fs python3dist(fs)"
RDEPENDS:${PN} += "python(abi) python39-appdirs python39-psutil python39-pytz python39-setuptools python39-six"

inherit rpm
