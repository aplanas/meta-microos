SUMMARY = "API documentation for httpcomponents-core"
DESCRIPTION = "API documentation for httpcomponents-core."
LICENSE = "Apache-2.0"

PV = "4.4.13"

RPM_NAME = "httpcomponents-core-javadoc-4.4.13-2.6.noarch.rpm"
RPM_HASH = "16f1a2b99383fd615a6bfcc3dd0b33ee170303335ba4741520f52977472267215f3560e946a48c418badc9d9bcaadf67c1f359f4b29f12065aa586835e0f3900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-core-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
