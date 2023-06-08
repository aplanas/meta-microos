SUMMARY = "Check That a Command Is Available"
DESCRIPTION = "Devel::CheckBin is a perl module that checks whether a particular command \
is available."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Devel-CheckBin-0.04-1.26.noarch.rpm"
RPM_HASH = "2836961be67549ef17565d98dd6cc31b74a216493e0d7f1650908f7b7bbed9191feeb315be106cbc84d17812c38f6a44885a63d6f3f1d352eecab6d51c15669d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::CheckBin) perl-Devel-CheckBin"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(ExtUtils::MakeMaker) perl(parent)"

inherit rpm
