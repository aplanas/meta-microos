SUMMARY = "Lexically warn about using the indirect method call syntax"
DESCRIPTION = "When enabled, this pragma warns about indirect method calls that are \
present in your code. \
 \
The indirect syntax is now considered harmful, since its parsing has many \
quirks and its use is error prone : when the subroutine 'foo' has not been \
declared in the current package, 'foo $x' actually compiles to '$x->foo', \
and 'foo { key => 1 }' to ''key'->foo(1)'. Please refer to the REFERENCES \
section for a more complete list of reasons for avoiding this construct. \
 \
This pragma currently does not warn for core functions ('print', 'say', \
'exec' or 'system'). This may change in the future, or may be added as \
optional features that would be enabled by passing options to 'unimport'. \
 \
This module is *not* a source filter."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.39"

RPM_NAME = "perl-indirect-0.39-1.19.aarch64.rpm"
RPM_HASH = "ef2e44def56de1f38a211636e0c89a6676f75e43263da176af56c34c95bccfe03c53eb19e962a8b2c253c77b631f5cf0fcf7af896e315f98f659a2ca802ceced"

RPROVIDES:${PN} += "perl(indirect) \
perl-indirect \
perl-indirect(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
