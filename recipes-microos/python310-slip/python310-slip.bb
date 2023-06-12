SUMMARY = "Miscellaneous convenience, extension and workaround code for Python"
DESCRIPTION = "The Simple Library for Python packages contain miscellaneous code for \
convenience, extension and workaround purposes. \
 \
This package provides the 'slip' and the 'slip.util' modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.5"

RPM_NAME = "python310-slip-0.6.5-6.15.noarch.rpm"
RPM_HASH = "e311922ddf2f960c6466889fd20dce47f9016436727ffe5e580d950e4a4d3bbc0a969df92723323db1480f157683a586f37badac4a587e7b2855746a49ee03d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slip \
python3.10dist(slip) \
python310-slip \
python3dist(slip)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
