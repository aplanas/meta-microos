SUMMARY = "Vertex GTK+3 Theme"
DESCRIPTION = "Vertex is a modern theme that comes with three variants to choose \
from. The default variant with dark header-bars, a light variant, \
and a dark variant. It supports MATE, Xfce, and Cinnamon. \
 \
This package contains the GTK+3 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20170128"

RPM_NAME = "gtk3-metatheme-vertex-20170128-3.10.noarch.rpm"
RPM_HASH = "314d64b36133515f4737cad201a3e8852ec1dac15f35d64f5a20a3cd25f2e1e576131803892d5bdf691a6c6fe162be2ec3009b70cdcd78648355639a98f8be40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-vertex"
RDEPENDS:${PN} += "gtk3 metatheme-vertex-common"

inherit rpm
