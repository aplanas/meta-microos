SUMMARY = "Vertex GTK+2 Theme"
DESCRIPTION = "Vertex is a modern theme that comes with three variants to choose \
from. The default variant with dark header-bars, a light variant, \
and a dark variant. It supports MATE, Xfce, and Cinnamon. \
 \
This package contains the GTK+2 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20170128"

RPM_NAME = "gtk2-metatheme-vertex-20170128-3.10.noarch.rpm"
RPM_HASH = "1292d1fd11506744c1b249023383156958d9df4e5b124b9c9bff489506fce2db8f96800a9408927926f51395ada5a2440117c71fef829348441ffc42f1b4b6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-vertex"
RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-vertex-common"

inherit rpm
