SUMMARY = "Local mode for Apache Ivy (files)"
DESCRIPTION = "This package contains files needed by local mode fow Apache Ivy, which \
allows artifact resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-ivy-6.1.0-3.1.noarch.rpm"
RPM_HASH = "6275fb8169dadb733bbc197650ba351d3c1c1d81ad13c43387f38aad3badcdd332047a2ebad866ee04cc136655000754a2911d36f7f75d6ba3f23afbd91e725a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapackages-ivy"
RDEPENDS:${PN} += "javapackages-local javapackages-tools"

inherit rpm
