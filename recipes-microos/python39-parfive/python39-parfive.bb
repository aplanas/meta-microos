SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-parfive-1.3.0-1.10.noarch.rpm"
RPM_HASH = "38ca2d0110ca0ea7b1fd94bb61e209b63e73387e1934e8ad99125247be403b9d0aa2cf2708267abdc7eccfef126744a3f603190ee239a105ace967dde19c1944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parfive) python39-parfive python3dist(parfive)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-aiohttp python39-tqdm update-alternatives"

inherit rpm
