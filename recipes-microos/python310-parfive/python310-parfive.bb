SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-parfive-1.3.0-1.10.noarch.rpm"
RPM_HASH = "76d3da78078182654ebd288246856c24944cba2b1f402f3b0301ec3d2c5b75aa4806f5fda02ed496761e3de9861bd716c305de3a94779656a09a5e1077d9e01e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parfive python3.10dist(parfive) python310-parfive python3dist(parfive)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-aiohttp python310-tqdm update-alternatives"

inherit rpm
