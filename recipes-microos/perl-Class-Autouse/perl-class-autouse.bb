SUMMARY = "Run-time load a class the first time you call a method in it"
DESCRIPTION = "*Class::Autouse* is a runtime class loader that allows you to specify \
classes that will only load when a method of that class is called. \
 \
For large classes or class trees that might not be used during the running \
of a program, such as Date::Manip, this can save you large amounts of \
memory, and decrease the script load time a great deal. \
 \
*Class::Autouse* also provides a number of 'unsafe' features for runtime \
generation of classes and implementation of syntactic sugar. These features \
make use of (evil) UNIVERSAL::AUTOLOAD hooking, and are implemented in this \
class because these hooks can only be done by a one module, and \
Class::Autouse serves as a useful place to centralise this kind of evil :)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.01"

RPM_NAME = "perl-Class-Autouse-2.01-11.20.noarch.rpm"
RPM_HASH = "08e1c939ebe7a35a0d828cdc857e7c5c3c3b5d2763ffb1c77d9403d6d77eebddeead35168305010f927e85c155bfb6ba291a552048c765edd0c68d644dc7cf04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Autouse) perl(Class::Autouse::Parent) perl-Class-Autouse"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
