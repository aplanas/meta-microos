SUMMARY = "Simple, compact and correct param-checking functions"
DESCRIPTION = "'Params::Util' provides a basic set of importable functions that makes \
checking parameters a hell of a lot easier \
 \
While they can be (and are) used in other contexts, the main point behind \
this module is that the functions *both* Do What You Mean, and Do The Right \
Thing, so they are most useful when you are getting params passed into your \
code from someone and/or somewhere else and you can't really trust the \
quality. \
 \
Thus, 'Params::Util' is of most use at the edges of your API, where params \
and data are coming in from outside your code. \
 \
The functions provided by 'Params::Util' check in the most strictly correct \
manner known, are documented as thoroughly as possible so their exact \
behaviour is clear, and heavily tested so make sure they are not fooled by \
weird data and Really Bad Things. \
 \
To use, simply load the module providing the functions you want to use as \
arguments (as shown in the SYNOPSIS). \
 \
To aid in maintainability, 'Params::Util' will *never* export by default. \
 \
You must explicitly name the functions you want to export, or use the \
':ALL' param to just have it export everything (although this is not \
recommended if you have any _FOO functions yourself with which future \
additions to 'Params::Util' may clash)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.102"

RPM_NAME = "perl-Params-Util-1.102-1.14.aarch64.rpm"
RPM_HASH = "ae403c79a8ddc8e95bbc1aa3891fe392951970b8bdc893cbf8e75f3e4cf815f3c6595a6dabd4e4b2691eb282ec30955e7feb34ae6e62c523cec724f2d707474f"

RPROVIDES:${PN} += "perl(Params::Util) perl(Params::Util::PP) perl-Params-Util perl-Params-Util(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(XSLoader)"

inherit rpm
