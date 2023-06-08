SUMMARY = "Recursively merge two or more hashes, simply"
DESCRIPTION = "Hash::Merge::Simple will recursively merge two or more hashes and return \
the result as a new hash reference. The merge function will descend and \
merge hashes that exist under the same node in both the left and right \
hash, but doesn't attempt to combine arrays, objects, scalars, or anything \
else. The rightmost hash also takes precedence, replacing whatever was in \
the left hash if a conflict occurs. \
 \
This code was pretty much taken straight from the Catalyst::Utils manpage, \
and modified to handle more than 2 hashes at the same time."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.051"

RPM_NAME = "perl-Hash-Merge-Simple-0.051-9.26.noarch.rpm"
RPM_HASH = "2916c1b4d6fc84b9b3940e4768a3a238a6b06f242ee962c15d46c5fe1daf0f805ba39c2a0071384adc3d61439a888980263dfc06d6d102d2e2a2df53654676cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Hash::Merge::Simple) perl-Hash-Merge-Simple"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Clone)"

inherit rpm
