SUMMARY = "Python dict subclass(es) with aliasing and attribute access"
DESCRIPTION = "Lexicon is a collection of dict subclasses: \
 \
* AliasDict, a dictionary supporting both simple and complex key aliasing \
* AttributeDict, supporting attribute read and write access \
* Lexicon, a subclass of both of the above which exhibits both sets of behavior"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python310-lexicon-2.0.1-4.1.noarch.rpm"
RPM_HASH = "f4c1d3c5c9ba8a2d868a38606d50e8ec56f2b90085251d1d4ee496cfd58ea4710d64103e701023500ea2c813c02677231e0f09bb7d6793434373c3b2406ee3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lexicon python3.10dist(lexicon) python310-lexicon python3dist(lexicon)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
