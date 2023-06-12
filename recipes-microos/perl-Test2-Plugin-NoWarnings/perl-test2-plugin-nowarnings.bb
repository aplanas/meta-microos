SUMMARY = "Fail if tests warn"
DESCRIPTION = "Loading this plugin causes your tests to fail if there any warnings while \
they run. Each warning generates a new failing test and the warning content \
is outputted via 'diag'. \
 \
This module uses '$SIG{__WARN__}', so if the code you're testing sets this, \
then this module will stop working."
LICENSE = "Artistic-2.0"

PV = "0.09"

RPM_NAME = "perl-Test2-Plugin-NoWarnings-0.09-1.13.noarch.rpm"
RPM_HASH = "6309e9a7f1437ba17fd0c043b1195ab0f54cda4e4aab4ff90fc5036f8fdb10e125a04db4d66b25caff89555721a96e79c0d8e3a6c54044bc81473e2021a0ecd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test2::Event::Warning) \
perl(Test2::Plugin::NoWarnings) \
perl-Test2-Plugin-NoWarnings"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test2) \
perl(Test2::API) \
perl(Test2::Event) \
perl(Test2::Util::HashBase) \
perl(parent)"

inherit rpm
