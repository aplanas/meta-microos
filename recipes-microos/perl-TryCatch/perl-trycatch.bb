SUMMARY = "first class try catch semantics for Perl, without source filters."
DESCRIPTION = "This module aims to provide a nicer syntax and method to catch errors in \
Perl, similar to what is found in other languages (such as Java, Python or \
C++). The standard method of using 'eval {}; if ($@) {}' is often prone to \
subtle bugs, primarily that its far too easy to stomp on the error in error \
handlers. And also eval/if isn't the nicest idiom."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.003002"

RPM_NAME = "perl-TryCatch-1.003002-6.26.aarch64.rpm"
RPM_HASH = "493ac92a8157710dc5ec214a61a18488293e60b8c0e129474df239b6ce627309f0ec4f32cd53b4309686e4f557542fd0c878ce2d2477297948b068a3b369a674"

RPROVIDES:${PN} += "perl(TryCatch) \
perl-TryCatch \
perl-TryCatch(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(B::Hooks::EndOfScope) \
perl(B::Hooks::OP::Check) \
perl(B::Hooks::OP::PPAddr) \
perl(Devel::Declare) \
perl(Moose) \
perl(MooseX::Types) \
perl(Parse::Method::Signatures) \
perl(Scope::Upper) \
perl(Sub::Exporter) \
perl(Variable::Magic) \
perl(namespace::clean)"

inherit rpm
