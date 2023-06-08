SUMMARY = "Documentation for metslib"
DESCRIPTION = "The metslib-doc package provides documentation for the metslib library."
LICENSE = "CPL-1.0 | GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "metslib-doc-0.5.3-2.7.noarch.rpm"
RPM_HASH = "2232a7aee61fad3d6842fc0d3bddca10496e175b066bc5dbe58ce21213a12ea21b5e26d77a243bbcd6010ad62e7b99e9bf5d30668262851668514d6bfcb24607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metslib-doc"
RDEPENDS:${PN} += ""

inherit rpm
