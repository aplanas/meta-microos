SUMMARY = "Files needed for stl-thumb development"
DESCRIPTION = "Files needed to develop applications for the stl-thumb."
LICENSE = "MIT"

PV = "0.5.0~0"

RPM_NAME = "stl-thumb-devel-0.5.0~0-1.5.aarch64.rpm"
RPM_HASH = "b17801f71844b1201976fce1510b1b84913f8103f8ead52991cc56abefac39a72be33d50e9d10a8e2949ade8253e421173cb6ed70d459dfad950fd0f85336301"

RPROVIDES:${PN} += "stl-thumb-devel stl-thumb-devel(aarch-64)"
RDEPENDS:${PN} += "libstl-thumb"

inherit rpm
