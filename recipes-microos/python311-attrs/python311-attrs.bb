SUMMARY = "Attributes without boilerplate"
DESCRIPTION = "attrs is an MIT-licensed Python package with class decorators that ease the \
chores of implementing the most common attribute-related object protocols. \
 \
You just specify the attributes to work with and attrs gives you: \
  - a nice human-readable __repr__, \
  - a complete set of comparison methods, \
  - an initializer, \
  - and much more \
 \
without writing dull boilerplate code again and again. \
 \
This gives you the power to use actual classes with actual types in your code \
instead of confusing tuples or confusingly behaving namedtuples. \
 \
So put down that type-less data structures and welcome some class into your \
life! \
 \
python-attrs is the successor to python-characterstic"
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python311-attrs-22.2.0-2.1.noarch.rpm"
RPM_HASH = "3d6bd1093f1573f75ec4ee1e1bb0419636507541b4f55c16bdb2ccad34b85613d3e522941f537bb3a9cf65d6e0821124a68cc4a9ec3bea277c4470090fa2e75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(attrs) python311-attrs python3dist(attrs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
