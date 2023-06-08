SUMMARY = "Qt 6 base unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-base-private-devel-6.5.0-3.1.noarch.rpm"
RPM_HASH = "8cf209e11b1f6d404b1f1d26a3e4d658d24fb6d6f70fda7fb6242929536f3ca43383d8528a87790e5bdabe411c216a7e14851958414c3e0597c86f56f96bc85c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-base-private-devel"
RDEPENDS:${PN} += "qt6-base-devel qt6-core-private-devel qt6-dbus-private-devel qt6-gui-private-devel qt6-kmssupport-private-devel qt6-network-private-devel qt6-opengl-private-devel qt6-platformsupport-private-devel qt6-printsupport-private-devel qt6-sql-private-devel qt6-test-private-devel qt6-widgets-private-devel qt6-xml-private-devel"

inherit rpm
