SUMMARY = "Support multimethods and function overloading in Perl"
DESCRIPTION = "The Class:Multimethod module exports a subroutine (&multimethod) that can \
be used to declare other subroutines that are dispatched using a algorithm \
different from the normal Perl subroutine or method dispatch mechanism."
LICENSE = "Artistic-1.0"

PV = "1.701"

RPM_NAME = "perl-Class-Multimethods-1.701-1.20.noarch.rpm"
RPM_HASH = "f558a8b819f2d0533e663778152647a236931c2efa74f559a3dea380e0cf6adcc1eaa4ddc064d074c038ce5c91fed13855ab9f10f3910aabf06af57d6a9354dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Multimethods) perl-Class-Multimethods"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
