SUMMARY = "Merges arbitrarily deep hashes into a single hash"
DESCRIPTION = "Hash::Merge merges two arbitrarily deep hashes into a single hash. That is, \
at any level, it will add non-conflicting key-value pairs from one hash to \
the other, and follows a set of specific rules when there are key value \
conflicts (as outlined below). The hash is followed recursively, so that \
deeply nested hashes that are at the same level will be merged when the \
parent hashes are merged. *Please note that self-referencing hashes, or \
recursive references, are not handled well by this method.* \
 \
Values in hashes are considered to be either ARRAY references, HASH \
references, or otherwise are treated as SCALARs. By default, the data \
passed to the merge function will be cloned using the Clone module; \
however, if necessary, this behavior can be changed to use as many of the \
original values as possible. (See 'set_clone_behavior')."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.302"

RPM_NAME = "perl-Hash-Merge-0.302-1.13.noarch.rpm"
RPM_HASH = "20f64a2ee52c82b513eb2f446f8ede785baca4c079598ebee7a3b9f27e6e295f5108b06c14131a37029c59450938a578462fa104a51228a28d6e03293f8ee9ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Hash::Merge) perl-Hash-Merge"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Clone::Choose)"

inherit rpm
