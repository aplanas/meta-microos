SUMMARY = "Javadoc for tesla-polyglot-common"
DESCRIPTION = "This package contains javadoc for tesla-polyglot-common."
LICENSE = "EPL-1.0"

PV = "0.4.5"

RPM_NAME = "tesla-polyglot-common-javadoc-0.4.5-1.3.noarch.rpm"
RPM_HASH = "e6e6c8d40384980b3dcf193d566eab4ceae5ed133bfbb3657d7b01e15bff88cba069cbf79e51ef7fb5666fe4af8327d72aa9325367fc0ad24f94f730621269a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesla-polyglot-common-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
