SUMMARY = "Manager for Python libraries' sample data files"
DESCRIPTION = "Pooch manages sample data files for Python libraries. It automatically \
downloads and stores them in a local directory, with support for versioning \
and checks for corruption."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-pooch-1.3.0-2.8.noarch.rpm"
RPM_HASH = "156883dcc9263433d53a7cc9a7b49f8dfe1050a75b58ac8f7ed18dedf03aa2e6c45eabfedbce9256339834908c20c2fc59e5ace1b08f60fb48900f0cd7477068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pooch) \
python39-pooch \
python3dist(pooch)"
RDEPENDS:${PN} += "python(abi) \
python39-appdirs \
python39-packaging \
python39-requests"

inherit rpm
