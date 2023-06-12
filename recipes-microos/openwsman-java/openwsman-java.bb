SUMMARY = "Java bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Java bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-java-2.7.2-2.5.noarch.rpm"
RPM_HASH = "ffcd0f2ea3942210a44cc1a0614c7d3f9c5b1f10c85f077a3ab10855849da232f9176161e65302e321d23717db479615a5c47ee0cd9c82885a685820374df842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openwsman-java"
RDEPENDS:${PN} += "java \
libwsman1"

inherit rpm
