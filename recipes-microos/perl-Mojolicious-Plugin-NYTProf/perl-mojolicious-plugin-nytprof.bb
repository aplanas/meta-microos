SUMMARY = "Auto handling of Devel::NYTProf in your Mojolicious app"
DESCRIPTION = "This plugin enables Mojolicious to automatically generate Devel::NYTProf \
profiles and routes for your app, it has been inspired by \
Dancer::Plugin::NYTProf"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.23"

RPM_NAME = "perl-Mojolicious-Plugin-NYTProf-0.23-1.13.noarch.rpm"
RPM_HASH = "cc87ecc5148a2d39364345af43b46a166f6e0117b6ae5b575432b0c296fe91308a12524e2ec71936924c7f81addaa57512022cbfe60aa797177aef736242aecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojolicious::Plugin::NYTProf) perl-Mojolicious-Plugin-NYTProf"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Devel::NYTProf) perl(File::Spec::Functions) perl(File::Temp) perl(File::Which) perl(Mojolicious) perl(Time::HiRes)"

inherit rpm
