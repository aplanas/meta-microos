SUMMARY = "Local mode for Apache Ivy (files)"
DESCRIPTION = "This package contains files needed by local mode fow Apache Ivy, which \
allows artifact resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-ivy-6.1.0-2.3.noarch.rpm"
RPM_HASH = "054fae2ba0e7879f2747ae5f5ef8805b20bfeedc532a9f77bdb4b1d03550d82a6ad87e5c375e87b285a96baeb156efe008acc468b73492c322eeed5f2d8051d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapackages-ivy"
RDEPENDS:${PN} += "javapackages-local javapackages-tools"

inherit rpm
