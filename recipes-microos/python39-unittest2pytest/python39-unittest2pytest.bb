SUMMARY = "Convert unittest test-cases to pytest"
DESCRIPTION = "Convert unittest test-cases to pytest."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "python39-unittest2pytest-0.4-1.13.noarch.rpm"
RPM_HASH = "39b654a6419b1f305f45717ab5d909fca77bbda4e0702f00002a1a26b529a2b179563821fd2128f2f958d93fa7541647c3fc257b3475df94660250a765bcf4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(unittest2pytest) python39-unittest2pytest python3dist(unittest2pytest)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
