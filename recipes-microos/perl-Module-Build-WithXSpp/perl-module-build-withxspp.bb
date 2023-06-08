SUMMARY = "XS++ enhanced flavour of Module::Build"
DESCRIPTION = "This subclass of the Module::Build manpage adds some tools and processes to \
make it easier to use for wrapping C++ using XS++ (the ExtUtils::XSpp \
manpage). \
 \
There are a few minor differences from using 'Module::Build' for an \
ordinary XS module and a few conventions that you should be aware of as an \
XS++ module author. They are documented in the the /'FEATURES AND \
CONVENTIONS' manpage section below. But if you can't be bothered to read \
all that, you may choose skip it and blindly follow the advice in the \
/'JUMP START FOR THE IMPATIENT' manpage. \
 \
An example of a full distribution based on this build tool can be found in \
the the ExtUtils::XSpp manpage distribution under _examples/XSpp-Example_. \
Using that example as the basis for your 'Module::Build::WithXSpp'-based \
distribution is probably a good idea."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Module-Build-WithXSpp-0.14-3.24.noarch.rpm"
RPM_HASH = "8f28b13dd8016cb6edcc430f3a6233d11651f07089bf40f282eac85697e794d47bdfb90c2789cb349214bc613e0f0f675dce9136ddaac7ebdf311506348a0b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Build::WithXSpp) perl-Module-Build-WithXSpp"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(ExtUtils::CBuilder) perl(ExtUtils::CppGuess) perl(ExtUtils::ParseXS) perl(ExtUtils::Typemaps) perl(ExtUtils::XSpp) perl(Module::Build)"

inherit rpm
