SUMMARY = "Common library for searching CPAN modules, authors and distributions"
DESCRIPTION = "This module provides a common library for working with a variety of CPAN \
index services. It is intentionally minimalist, trying to use as few \
non-core modules as possible. \
 \
The 'CPAN::Common::Index' module is an abstract base class that defines a \
common API. Individual backends deliver the API for a particular index. \
 \
As shown in the SYNOPSIS, one interesting application is multiplexing -- \
using different index backends, querying each in turn, and returning the \
first result."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-CPAN-Common-Index-0.010-1.10.noarch.rpm"
RPM_HASH = "d18bdb881d6e882d73af0d2ceb1f15c85781dd49d610baa4327c0f16fc3b6f1e46645b4789f992380c20d43c4db1fd1b58519634982acd739236b39b93ba1aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CPAN::Common::Index) perl(CPAN::Common::Index::LocalPackage) perl(CPAN::Common::Index::MetaDB) perl(CPAN::Common::Index::Mirror) perl(CPAN::Common::Index::Mux::Ordered) perl-CPAN-Common-Index"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(CPAN::DistnameInfo) perl(CPAN::Meta::YAML) perl(Class::Tiny) perl(File::Fetch) perl(File::Temp) perl(HTTP::Tiny) perl(Module::Load) perl(Search::Dict) perl(Tie::Handle::SkipHeader) perl(URI) perl(parent)"

inherit rpm
