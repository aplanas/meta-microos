SUMMARY = "Return-Value Object That Lets You Treat It"
DESCRIPTION = "Class::ReturnValue is a 'clever' return value object that can allow code \
calling your routine to expect: a boolean value (did it fail) or a list \
(what are the return values)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.55"

RPM_NAME = "perl-Class-ReturnValue-0.55-15.20.noarch.rpm"
RPM_HASH = "b7c3a052a9d7a667adcd999e6d2bbc352436c57fb211ebfb97f764fc402e6956e87a75fe024d0d37adc089ef5440161df618c0bcfd8c99820afe16dd7568bf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::ReturnValue) perl-Class-ReturnValue"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Devel::StackTrace)"

inherit rpm
