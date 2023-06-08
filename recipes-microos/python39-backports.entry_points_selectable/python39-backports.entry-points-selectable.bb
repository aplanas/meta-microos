SUMMARY = "Compatibility shim providing selectable entry points for older implementations"
DESCRIPTION = "Compatibility shim providing selectable entry points for older implementations"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-backports.entry_points_selectable-1.2.0-1.1.noarch.rpm"
RPM_HASH = "760404d22862561b7acb90781d4a40c780b76800ff4b8d1345d824349bb8be77202d48d09919fe849a01f422989684190b9d83aa312ac42f41bd9b51e48c1a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(backports.entry-points-selectable) python39-backports.entry_points_selectable python3dist(backports.entry-points-selectable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
