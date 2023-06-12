SUMMARY = "Interactive data selection cursors for Matplotlib"
DESCRIPTION = "mplcursors provides interactive data selection cursors for Matplotlib."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python39-mplcursors-0.5.2-1.3.noarch.rpm"
RPM_HASH = "fd8efecb132e29319ea7b0c158d13fd1a6467915724e7f6d4ef48113ded385318af0131a8f92859092178fd57f1006933c1cf91e1993013622392d41d8a65937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mplcursors) \
python39-mplcursors \
python3dist(mplcursors)"
RDEPENDS:${PN} += "python(abi) \
python39-matplotlib"

inherit rpm
