SUMMARY = "API documentation for plexus-interactivity"
DESCRIPTION = "This package provides API documentation for plexus-interactivity."
LICENSE = "MIT"

PV = "1.0~alpha6"

RPM_NAME = "plexus-interactivity-javadoc-1.0~alpha6-2.6.noarch.rpm"
RPM_HASH = "bc8907b605d3581c5bef799a6bf43dc3a893b439ea072c559ad033198bf2e4067f8f62af5f24359235a1cdce2c292986664abd87090e9c6f08ea01e4ed9cb841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-interactivity-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
