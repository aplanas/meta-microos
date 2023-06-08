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

RPM_NAME = "python39-attrs-22.2.0-2.1.noarch.rpm"
RPM_HASH = "ea3e5f001811ffd11f85462ecbcfafe7b4b941ce8479ef90d6a0ca901ba536ea6fbadbfbb05a5bf519ec626343019919cc6174c118e638d884a533e46e3ee8ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(attrs) python39-attrs python3dist(attrs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
