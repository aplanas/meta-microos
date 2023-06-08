SUMMARY = "Javadoc for the Units of Measurement Libraries"
DESCRIPTION = "This package contains documentation for the Units of Measurement \
Libraries (JSR 363)."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-javadoc-1.2-1.18.noarch.rpm"
RPM_HASH = "57be4be17101b7cd06d897709f51596552dea266e09f9e435eb2e4d1ade08877dbc3e9bf1dc3563c0a994423f0b55666b90c5aa34fe60f8ed14c551019388153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uom-lib-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
