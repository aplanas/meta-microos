SUMMARY = "Units of Measurement Project Parent POM"
DESCRIPTION = "Main parent POM for all Units of Measurement Maven projects."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "uom-parent-1.3-1.18.noarch.rpm"
RPM_HASH = "4577cdb244e4216d943781aa67e6384099c25b73e7f0b11dd9b700d1ed2106b3c468860c6053c0df8235a9bc80d9cdfc2f95d6732e3fea5bfb5673cc0f856355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(tech.uom:uom-parent:pom:) uom-parent"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
