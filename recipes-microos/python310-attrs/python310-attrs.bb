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

RPM_NAME = "python310-attrs-22.2.0-2.1.noarch.rpm"
RPM_HASH = "9a629886d05b276451b669edf031cd4a7fda1b5e4a46e7b64f9959e3931cf09b24ca5884f09a9c43675b0d15f2d4098d26fec54b17d5a9bc41c4a236310cc563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-attrs python3.10dist(attrs) python310-attrs python3dist(attrs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
