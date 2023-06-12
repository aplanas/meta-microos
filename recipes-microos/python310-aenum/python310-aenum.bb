SUMMARY = "Advanced Enumerations, NamedTuples, and NamedConstants"
DESCRIPTION = "Advanced Enumerations (compatible with Python's stdlib Enum), \
NamedTuples, and NamedConstants \
 \
AEnum includes a Python stdlib Enum-compatible data type, as well as \
a metaclass-based NamedTuple implementation and a NamedConstant \
class. \
 \
An Enum is a set of symbolic names (members) bound to unique, \
constant values. Within an enumeration, the members can be compared \
by identity, and the enumeration itself can be iterated over.  If \
using Python 3 there is built-in support for unique values, multiple \
values, auto-numbering, and suspension of aliasing (members with the \
same value are not identical), plus the ability to have values \
automatically bound to attributes. \
 \
A NamedTuple is a class-based, fixed-length tuple with a name for \
each possible position accessible using attribute-access notation as \
well as the standard index notation. \
 \
A NamedConstant is a class whose members cannot be rebound; it lacks \
all other Enum capabilities, however; consequently, it can have \
duplicate values."
LICENSE = "BSD-3-Clause"

PV = "3.1.11"

RPM_NAME = "python310-aenum-3.1.11-1.3.noarch.rpm"
RPM_HASH = "ef8e0878299cf7aea2b24c094d88b6ad9bf84ac6e8943fc05dcf859ef7d84de6b1eacc4d261072f06b7388e2cc32b1fb21e8aac295e73fac04ebc45e80ed3f31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aenum \
python3.10dist(aenum) \
python310-aenum \
python3dist(aenum)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
