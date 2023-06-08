SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "0.1.195"

RPM_NAME = "python311-wheezy.template-0.1.195-2.12.noarch.rpm"
RPM_HASH = "52c66888620c596b6014a36296942ca6b2aea83196c862baf5d53173c7d8c296f5975d0a0c4deb44cca59ca24b8cd3f1d418152c647bfa732532aad2df4f3392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wheezy.template) python311-wheezy.template python3dist(wheezy.template)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi)"

inherit rpm
