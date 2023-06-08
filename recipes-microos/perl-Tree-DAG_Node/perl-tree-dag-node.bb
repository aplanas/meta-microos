SUMMARY = "An N-ary tree"
DESCRIPTION = "This class encapsulates/makes/manipulates objects that represent nodes in a \
tree structure. The tree structure is not an object itself, but is emergent \
from the linkages you create between nodes. This class provides the methods \
for making linkages that can be used to build up a tree, while preventing \
you from ever making any kinds of linkages which are not allowed in a tree \
(such as having a node be its own mother or ancestor, or having a node have \
two mothers)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.32"

RPM_NAME = "perl-Tree-DAG_Node-1.32-1.10.noarch.rpm"
RPM_HASH = "357bbe358552b2382f5169998f0418988c030c64f7b3ba4697c06ca117b170eb57f69939721e9967b56a7aeec3050478551702b144d61a9208842219c18d05f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Tree::DAG_Node) perl-Tree-DAG_Node"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(File::Slurp::Tiny)"

inherit rpm
