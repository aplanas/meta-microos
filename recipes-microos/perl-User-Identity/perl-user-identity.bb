SUMMARY = "Collect information about a user"
DESCRIPTION = "The 'User-Identity' distribution is created to maintain a set of \
informational objects which are related to one user. The 'User::Identity' \
module tries to be smart providing defaults, conversions and often required \
combinations. \
 \
The identities are not implementing any kind of storage, and can therefore \
be created by any simple or complex Perl program. This way, it is more \
flexible than an XML file to store the data. For instance, you can decide \
to store the data with Data::Dumper, Storable, DBI, AddressBook or \
whatever. Extension to simplify this task are still to be developed. \
 \
If you need more kinds of user information, then please contact the module \
author. \
 \
Extends 'DESCRIPTION' in User::Identity::Item."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-User-Identity-1.02-1.1.noarch.rpm"
RPM_HASH = "f909f410b8d44968ae3ca371a9834f04c21c498b410ccbfb0abd62af41c91e5cb1a830762d1b2bb5faa24d8e48bcf078a507439bdc2fd381ab7332d3efeb4f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mail::Identity) \
perl(User::Identity) \
perl(User::Identity::Archive) \
perl(User::Identity::Archive::Plain) \
perl(User::Identity::Collection) \
perl(User::Identity::Collection::Emails) \
perl(User::Identity::Collection::Locations) \
perl(User::Identity::Collection::Systems) \
perl(User::Identity::Collection::Users) \
perl(User::Identity::Item) \
perl(User::Identity::Location) \
perl(User::Identity::System) \
perl-User-Identity"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Hash::Ordered)"

inherit rpm
