SUMMARY = "Create generic methods for OO Perl"
DESCRIPTION = "This module solves the problem of having to continually write accessor \
methods for your objects that perform standard tasks. \
 \
The argument to 'use' is an *arrayref*, as pairs whose 'keys' are the names \
of types of generic methods generated by MethodMaker and whose 'values' \
tell method maker what methods to make. \
 \
To override any generated methods, it is sufficient to ensure that the \
overriding method is defined when Class::MethodMaker is called. Note that \
the 'use' keyword introduces a 'BEGIN' block, so you may need to define (or \
at least declare) your overriding method in a 'BEGIN' block."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.24"

RPM_NAME = "perl-Class-MethodMaker-2.24-2.31.aarch64.rpm"
RPM_HASH = "86bfa1162f0dd17fc3e831b9ac7edf6c9fdec965b91ddc4dc8be7d7ac346d1f443768fa4983585f8cadf016656e9b032e439b56bb0d22155214dd957163005a9"

RPROVIDES:${PN} += "perl(Class::MethodMaker) \
perl(Class::MethodMaker::Constants) \
perl(Class::MethodMaker::Engine) \
perl(Class::MethodMaker::OptExt) \
perl(Class::MethodMaker::V1Compat) \
perl(Class::MethodMaker::array) \
perl(Class::MethodMaker::hash) \
perl(Class::MethodMaker::scalar) \
perl-Class-MethodMaker \
perl-Class-MethodMaker(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
