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

RPM_NAME = "python311-aenum-3.1.11-1.3.noarch.rpm"
RPM_HASH = "f9bbf980862ac1f59a750dd7ca1980cd6425382372e92fbf882b2a7fc6539d1074cdf24dfcecb09474502a0eabce4cd107850ac14f10596f50f69014f651a0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aenum) \
python311-aenum \
python3dist(aenum)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
