SUMMARY = "Generate Recursive-Descent Parsers"
DESCRIPTION = "Generate Recursive-Descent Parsers"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.967015"

RPM_NAME = "perl-Parse-RecDescent-1.967015-1.22.aarch64.rpm"
RPM_HASH = "95cb29b4d2d32bbb175dcbc27d9bef3b5adb1af65a64631e25cb7ba1240b701f5e04950924b7c13b08ca5956becf7e70f6fac910fde72e0e4a70c07ee5e87b80"

RPROVIDES:${PN} += "perl(Parse::RecDescent) perl(Parse::RecDescent::Action) perl(Parse::RecDescent::ColCounter) perl(Parse::RecDescent::Directive) perl(Parse::RecDescent::Error) perl(Parse::RecDescent::Expectation) perl(Parse::RecDescent::InterpLit) perl(Parse::RecDescent::LineCounter) perl(Parse::RecDescent::Literal) perl(Parse::RecDescent::OffsetCounter) perl(Parse::RecDescent::Operator) perl(Parse::RecDescent::Production) perl(Parse::RecDescent::Repetition) perl(Parse::RecDescent::Result) perl(Parse::RecDescent::Rule) perl(Parse::RecDescent::Subrule) perl(Parse::RecDescent::Token) perl(Parse::RecDescent::UncondReject) perl-Parse-RecDescent perl-Parse-RecDescent(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
