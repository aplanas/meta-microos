SUMMARY = "Safe code refactoring for modern Python projects"
DESCRIPTION = "Bowler is a refactoring tool for manipulating Python at the syntax tree level. It enables \
safe, large scale code modifications while guaranteeing that the resulting code compiles \
and runs. It provides both a simple command line interface and a fluent API in Python for \
generating complex code modifications in code. \
 \
Bowler uses a 'fluent' `Query` API to build refactoring scripts through a series \
of selectors, filters, and modifiers.  Many simple modifications are already possible \
using the existing API, but you can also provide custom selectors, filters, and \
modifiers as needed to build more complex or custom refactorings.  See the \
[Query Reference](https://pybowler.io/docs/api-query) for more details."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-bowler-0.9.0-1.17.noarch.rpm"
RPM_HASH = "e5e274d5664641641d0a5cc91dd47c4b04f26fa048375590471dd7066ec99328f3d23534b6479858910b242cb7625be53843e5bd664f421d82c577b154f8c83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bowler) \
python39-bowler \
python3dist(bowler)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-attrs \
python39-click \
python39-fissix \
python39-moreorless \
python39-setuptools \
python39-volatile \
update-alternatives"

inherit rpm
