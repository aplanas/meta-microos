SUMMARY = "Development files for the Heaptrack API"
DESCRIPTION = "This package contains files needed to develop for the Heaptrack \
API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-devel-1.4.0-4.4.aarch64.rpm"
RPM_HASH = "04d06eb8dbe80fbaf25189927cc3e2802a6bb6106e7d82475622ef134ddc913d247d0e77bf1ea4bc76f9b6e2e4e011e99b6c1732562397d78ffb194d5f85d19f"

RPROVIDES:${PN} += "heaptrack-devel \
heaptrack-devel(aarch-64)"
RDEPENDS:${PN} += "heaptrack"

inherit rpm
