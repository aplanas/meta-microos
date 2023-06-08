SUMMARY = "Compatibility shim providing selectable entry points for older implementations"
DESCRIPTION = "Compatibility shim providing selectable entry points for older implementations"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-backports.entry_points_selectable-1.2.0-1.1.noarch.rpm"
RPM_HASH = "405d26b5a9cdff2d445e335c45964daf8319c066fc6aa07d0076376f739b2c834938fe8c3baca95858c593894111e21518b23f9393185282a47fc9e9da121091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(backports.entry-points-selectable) python311-backports.entry_points_selectable python3dist(backports.entry-points-selectable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
