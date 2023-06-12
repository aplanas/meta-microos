SUMMARY = "Polymorphic data cloning"
DESCRIPTION = "'Data::Clone' does data cloning, i.e. copies things recursively. This is \
smart so that it works with not only non-blessed references, but also with \
blessed references (i.e. objects). When 'clone()' finds an object, it calls \
a 'clone' method of the object if the object has a 'clone', otherwise it \
makes a surface copy of the object. That is, this module does polymorphic \
data cloning. \
 \
Although there are several modules on CPAN which can clone data, this \
module has a different cloning policy from almost all of them. See Cloning \
policy and Comparison to other cloning modules for details."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-Data-Clone-0.004-4.29.aarch64.rpm"
RPM_HASH = "4892c99bd6a46cca9edb07e1124d1ca24c060e790fb9da2fe224e3c80507aba5e1814b4735afd5756a82aa80afc397a5868b7df8930e0ac11a26d0e37a918b7c"

RPROVIDES:${PN} += "perl(Data::Clone) \
perl-Data-Clone \
perl-Data-Clone(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(parent)"

inherit rpm
