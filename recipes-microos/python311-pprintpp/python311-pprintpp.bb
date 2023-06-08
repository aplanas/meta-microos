SUMMARY = "A variant of pprint that is arguably 'prettier'"
DESCRIPTION = "A drop-in replacement for pprint that is arguably prettier."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "python311-pprintpp-0.4.0-6.2.noarch.rpm"
RPM_HASH = "f63f57aa23243bc8ce2d5a97c7dbe17deb08573342cdc1d379ed824633b09d8c68cd98ae6126ca7728fd40131f72014e304ed132306a3d2c7cc26d3f3bb8108e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pprintpp) python311-pprintpp python3dist(pprintpp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
