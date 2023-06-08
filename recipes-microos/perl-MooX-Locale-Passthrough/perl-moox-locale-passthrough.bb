SUMMARY = "Provide API used in translator modules without translating"
DESCRIPTION = "'MooX::Locale::Passthrough' is made to allow CPAN modules use translator \
API without adding heavy dependencies (external software) or requirements \
(operating resulting solution). \
 \
This software is released together with MooX::Locale::TextDomain::OO, which \
allowes then to plugin any desired translation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001"

RPM_NAME = "perl-MooX-Locale-Passthrough-0.001-1.12.noarch.rpm"
RPM_HASH = "c30b0031811ef10f2feb7c59e8f09e1e0f3cc9e52b8ffaa1d44267abc64ffffb488f73e2e505fcb677f6554d1f7b9a733c8f359871bf2097a02011122e82d0e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooX::Locale::Passthrough) perl-MooX-Locale-Passthrough"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moo)"

inherit rpm
