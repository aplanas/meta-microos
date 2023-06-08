SUMMARY = "Produces charts with GD"
DESCRIPTION = "Produces charts with GD"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-or-later"

PV = "1.54"

RPM_NAME = "perl-GDGraph-1.54-3.7.noarch.rpm"
RPM_HASH = "a02c60f12d9f525cfbd160f796070782e2ceeb4312796980bf2ce6e1ef9715a1515ba62947fea4e0caa1a27d5e274b0d124e9c494a2a1b17d856c7ab5aa7b760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(GD::Graph) perl(GD::Graph::Data) perl(GD::Graph::Error) perl(GD::Graph::area) perl(GD::Graph::axestype) perl(GD::Graph::bars) perl(GD::Graph::colour) perl(GD::Graph::hbars) perl(GD::Graph::lines) perl(GD::Graph::linespoints) perl(GD::Graph::mixed) perl(GD::Graph::pie) perl(GD::Graph::points) perl(GD::Graph::utils) perl-GDGraph"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(GD) perl(GD::Text)"

inherit rpm
