SUMMARY = "Simple Copy + Paste in Python"
DESCRIPTION = "Python copy and paste library supporting OS X, X11 (Linux, BSD, etc.), and Windows."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-xerox-0.4.1-2.14.noarch.rpm"
RPM_HASH = "90f185aae660c8c56a41fc706de2109579b0339aa18df9a9afccd274186ec4fd965bf70218e7fd5f2b5df6c32b0963eebf439dc889c0f469a4ea2756172b5ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xerox python3.10dist(xerox) python310-xerox python3dist(xerox)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives xclip"

inherit rpm
