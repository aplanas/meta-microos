SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "0.1.195"

RPM_NAME = "python39-wheezy.template-0.1.195-2.12.noarch.rpm"
RPM_HASH = "b84ec2fbe3956bc209b78baad960c48b2a5979499400cf9c19f12e0840778aa748faf7c1031d58b610a8c436b02e39dedba9551ec40d045219a900dd431bf254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wheezy.template) python39-wheezy.template python3dist(wheezy.template)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi)"

inherit rpm
