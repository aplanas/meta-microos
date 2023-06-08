SUMMARY = "blessed arrayrefs with Moose"
DESCRIPTION = "Objects implemented with arrayrefs rather than hashrefs are often faster \
than those implemented with hashrefs. Moose's default object implementation \
is hashref based. Can we go faster? \
 \
Simply 'use MooseX::ArrayRef' instead of 'use Moose', but note the \
limitations in the section below. \
 \
The current implementation is mostly a proof of concept, but it does mostly \
seem to work."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.005"

RPM_NAME = "perl-MooseX-ArrayRef-0.005-1.25.noarch.rpm"
RPM_HASH = "3d7fb4540860200d65811c6cf7ba1091610f3c624c75708ae80d6669ab3c468cc73f9851e0968c113cc2b892fc82a91d1b7054b8b8556267ecb16bb3dbfe73dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::ArrayRef) perl(MooseX::ArrayRef::Meta::Class) perl(MooseX::ArrayRef::Meta::Instance) perl-MooseX-ArrayRef"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moose)"

inherit rpm
