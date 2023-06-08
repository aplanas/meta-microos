SUMMARY = "Set of objects and strings"
DESCRIPTION = "This modules implements a set of objects, that is, an unordered collection \
of objects without duplication. \
 \
The term _objects_ is applied loosely - for the sake of Set::Object, \
anything that is a reference is considered an object. \
 \
Set::Object 1.09 and later includes support for inserting scalars \
(including the empty string, but excluding 'undef') as well as objects. \
This can be thought of as (and is currently implemented as) a degenerate \
hash that only has keys and no values. Unlike objects placed into a \
Set::Object, scalars that are inserted will be flattened into strings, so \
will lose any magic (eg, tie) or other special bits that they went in with; \
only strings come out."
LICENSE = "Artistic-2.0"

PV = "1.42"

RPM_NAME = "perl-Set-Object-1.42-1.8.aarch64.rpm"
RPM_HASH = "5c994524fd8872458d5861dc04f322b6421b6489ee41a0219cc764c9ae127d6b75a091431d31a0ae16aa247d5a5a73bdbaf9b089c98d67c298c79cf0aedac5dc"

RPROVIDES:${PN} += "perl(Set::Object) perl(Set::Object::Weak) perl-Set-Object perl-Set-Object(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
