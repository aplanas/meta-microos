SUMMARY = "Generic plugin framework for Java look-and-feels"
DESCRIPTION = "The goal of this project is to provide a small infrastructure that \
provides plugin mechanism for third-party components in look-and-feel \
libraries."
LICENSE = "BSD-3-Clause & Zlib"

PV = "1.0"

RPM_NAME = "laf-plugin-1.0-7.6.noarch.rpm"
RPM_HASH = "26fc72958f972c670f594233c3d5217a0354313e35465f1e7121a11e31bbd0d841ef3ecc86091d33b264eae41c7d820b3ba00453ce022ddd03e2af90f115f507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "laf-plugin"
RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
