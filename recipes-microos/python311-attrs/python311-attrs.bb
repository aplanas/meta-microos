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

PV = "23.1.0"

RPM_NAME = "python311-attrs-23.1.0-1.1.noarch.rpm"
RPM_HASH = "4eeddd11fb0ca50177e7c16bbcb792183d25b0fcabca323433a1836581d8e08c89895b8e88f42c3d2254774fdfe2d26e35b2126836287529a4e421490aea9fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(attrs) python311-attrs python3dist(attrs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
