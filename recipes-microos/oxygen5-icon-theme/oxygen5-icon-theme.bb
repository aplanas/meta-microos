SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "oxygen5-icon-theme-5.105.0-1.1.noarch.rpm"
RPM_HASH = "b3e5378e81f41c9831c48ef754f7ec5480593aa3eb3d553cec7b5f2bc99779d3504ca62cf897c95d17809c4c4fc3a234d000f262e3674004b1178c9f48d3d97f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme oxygen5-icon-theme"
RDEPENDS:${PN} += "hicolor-icon-theme"

inherit rpm
