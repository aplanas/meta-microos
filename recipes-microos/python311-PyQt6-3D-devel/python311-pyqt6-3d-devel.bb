SUMMARY = "Devel files for python311-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-3D-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "62c51958beea2f247abaf310b9e1fe0af01ff935b44481b2cea618648c2a8750b8823ed4d85cb7af4fb8894ea35ad9e7ea68e397f0bee1236aa2d6ac29c1740f"

RPROVIDES:${PN} += "python311-PyQt6-3D-devel python311-PyQt6-3D-devel(aarch-64)"
RDEPENDS:${PN} += "python311-PyQt6-devel"

inherit rpm
