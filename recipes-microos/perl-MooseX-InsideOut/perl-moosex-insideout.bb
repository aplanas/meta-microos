SUMMARY = "inside-out objects with Moose"
DESCRIPTION = "MooseX::InsideOut provides metaroles for inside-out objects. That is, it \
sets up attribute slot storage somewhere other than inside '$self'. This \
means that you can extend non-Moose classes, whose internals you either \
don't want to care about or aren't hash-based."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.106"

RPM_NAME = "perl-MooseX-InsideOut-0.106-9.25.noarch.rpm"
RPM_HASH = "aedf28736d966f02fcfefdd307efbdcb21a50cbf83e47ea20b304e7e442d34d2a45156f729f8da6ee8776d60c4ece49ccb39e087cab9069dea3f1af5fba48c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::InsideOut) \
perl(MooseX::InsideOut::Role::Meta::Instance) \
perl-MooseX-InsideOut"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::MOP) \
perl(Hash::Util::FieldHash::Compat) \
perl(Moose) \
perl(namespace::clean)"

inherit rpm
