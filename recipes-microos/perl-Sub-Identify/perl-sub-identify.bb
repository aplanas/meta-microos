SUMMARY = "Retrieve names of code references"
DESCRIPTION = "'Sub::Identify' allows you to retrieve the real name of code references. \
 \
It provides six functions, all of them taking a code reference. \
 \
'sub_name' returns the name of the code reference passed as an argument (or \
'__ANON__' if it's an anonymous code reference), 'stash_name' returns its \
package, and 'sub_fullname' returns the concatenation of the two. \
 \
'get_code_info' returns a list of two elements, the package and the \
subroutine name (in case of you want both and are worried by the speed.) \
 \
In case of subroutine aliasing, those functions always return the original \
name. \
 \
'get_code_location' returns a two-element list containing the file name and \
the line number where the subroutine has been defined. \
 \
'is_sub_constant' returns a boolean value indicating whether the subroutine \
is a constant or not."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Sub-Identify-0.14-1.32.aarch64.rpm"
RPM_HASH = "ef34edec74f66b47721b04fbeab25329120df049416760f5c180fcab791fa9370ba280d223101d50389d468b9540e73aaeed1f7668acb962ebcc8292ce76ac59"

RPROVIDES:${PN} += "perl(Sub::Identify) perl-Sub-Identify perl-Sub-Identify(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
