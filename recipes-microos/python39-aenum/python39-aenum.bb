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

RPM_NAME = "python39-aenum-3.1.11-1.3.noarch.rpm"
RPM_HASH = "add3f6504dc229895c93c4db04f1992ae1e0da5a39e9f1b3b80a58ad2af43954cc6e4b9bcbe15112617f05aafc1eb42d8cca62f0933a10353e9b9c5afe649299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aenum) python39-aenum python3dist(aenum)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
