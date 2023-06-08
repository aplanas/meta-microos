SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "0.1.195"

RPM_NAME = "python310-wheezy.template-0.1.195-2.12.noarch.rpm"
RPM_HASH = "9c6ccbdbd9654289732070fc39e734ccf07eff38bdcd99833c450f5f5503bc98b3e6e0476d4080bdee208842566983dabbaf667081f5dcf7abe024d2a663fa20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wheezy.template python3.10dist(wheezy.template) python310-wheezy.template python3dist(wheezy.template)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi)"

inherit rpm
