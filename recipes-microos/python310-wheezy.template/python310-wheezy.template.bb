SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-wheezy.template-3.1.0-1.1.noarch.rpm"
RPM_HASH = "83143962a18ba1b5aa7647c23ca33567aee273833e6748a45eb703f6d210d8aa0433f429df62450da729db73c7b3b26d7c51a9a024f481668f333d9604c125ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wheezy.template python3.10dist(wheezy.template) python310-wheezy.template python3dist(wheezy.template)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
