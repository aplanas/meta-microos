SUMMARY = "An object representing a stack trace"
DESCRIPTION = "The 'Devel::StackTrace' module contains two classes, 'Devel::StackTrace' \
and Devel::StackTrace::Frame. These objects encapsulate the information \
that can retrieved via Perl's 'caller' function, as well as providing a \
simple interface to this data. \
 \
The 'Devel::StackTrace' object contains a set of 'Devel::StackTrace::Frame' \
objects, one for each level of the stack. The frames contain all the data \
available from 'caller'. \
 \
This code was created to support my Exception::Class::Base class (part of \
Exception::Class) but may be useful in other contexts."
LICENSE = "Artistic-2.0"

PV = "2.04"

RPM_NAME = "perl-Devel-StackTrace-2.04-1.16.noarch.rpm"
RPM_HASH = "f68b75a114367ac7c49170bcef8f61ccdd3a4c4e0fdaa9596408ea8d1223bce65fd789560c0feb030d0e7a125240af6df4d09490002aa6e07014f1f2462bb322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::StackTrace) \
perl(Devel::StackTrace::Frame) \
perl-Devel-StackTrace"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
