SUMMARY = "Build helpers for gnome game packages"
DESCRIPTION = "gnome-games-scripts is nothing more than a helper package producing \
the post scriptlets for various gnome-games descendents. \
 \
The script does not serve much purpose out of this usecase."
LICENSE = "MIT"

PV = "3.8.0"

RPM_NAME = "gnome-games-scripts-3.8.0-6.11.noarch.rpm"
RPM_HASH = "16cab82872a7f984ee0cc97ba856ccaf978ec8a6f8268fdf42a4b99e389a1e359398439c976a052e9e3098671990c915c929ed91f09aec831b75eaedc71bcb3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-games-scripts"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
