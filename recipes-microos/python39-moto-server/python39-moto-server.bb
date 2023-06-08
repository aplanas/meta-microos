SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-server-4.1.0-1.5.noarch.rpm"
RPM_HASH = "d5fafe44707d6ae7ab04d79e0cf406a2b7815812e1010c2090807c6afb6dd7a9eeaab1ec2fa2b719ad5f6ab2ae1aafba290d91356ad98c5426ddc96374afe624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-moto-server"
RDEPENDS:${PN} += "python39-Flask python39-Flask-Cors python39-moto-all"

inherit rpm
