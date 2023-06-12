SUMMARY = "Implementation of a 'Singleton' class"
DESCRIPTION = "This is the 'Class::Singleton' module. A Singleton describes an object \
class that can have only one instance in any system. An example of a \
Singleton might be a print spooler or system registry. This module \
implements a Singleton class from which other classes can be derived. By \
itself, the 'Class::Singleton' module does very little other than manage \
the instantiation of a single object. In deriving a class from \
'Class::Singleton', your module will inherit the Singleton instantiation \
method and can implement whatever specific functionality is required. \
 \
For a description and discussion of the Singleton class, see 'Design \
Patterns', Gamma et al, Addison-Wesley, 1995, ISBN 0-201-63361-2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.6"

RPM_NAME = "perl-Class-Singleton-1.6-1.11.noarch.rpm"
RPM_HASH = "23ecb44580a3094dce4cc5249da0ec2da52782812cc50b5cf880d4bd39ac2d599b3acdcc9d60e4ffd68323dcf766f90141cf901eb4d13344de40e3ddbd0342a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Singleton) \
perl-Class-Singleton"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
