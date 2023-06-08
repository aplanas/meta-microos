SUMMARY = "Thing you can identify somehow"
DESCRIPTION = "Role::Identifiable isn't really a module that does anything. It's here to \
make things simpler for indexing on CPAN and looking up docs. \
 \
You probably want to use either Role::Identifiable::HasIdent, for \
identifying things by an identifier string, or Role::Identifiable::HasTags \
for identifying things by a list of tags."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-Role-Identifiable-0.009-1.2.noarch.rpm"
RPM_HASH = "67b8eadf13a025f789d0b5fc6a47a826687c48fa5373329a8cb28b06daf55a076ed1d78c4fefa229000f7b93a5ed8b1cac1ed45b965362f946d0319340ec36a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Role::Identifiable) perl(Role::Identifiable::HasIdent) perl(Role::Identifiable::HasTags) perl-Role-Identifiable"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moose::Role) perl(Moose::Util::TypeConstraints)"

inherit rpm
