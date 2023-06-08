SUMMARY = "Perl extension for the SANE (Scanner Access Now Easy)"
DESCRIPTION = "These Perl bindings for the SANE (Scanner Access Now Easy) Project allow \
you to access SANE-compatible scanners in a Perlish and object-oriented \
way, freeing you from the casting and memory management in C, yet remaining \
very close in spirit to original API. \
 \
Find out more about SANE at http://www.sane-project.org."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5"

RPM_NAME = "perl-Image-Sane-5-2.18.aarch64.rpm"
RPM_HASH = "59c499befef5180529c1b5079d7edf3a48514b471a9241b858b883bd47a944ef07e30783f2db70d9dc2ae2e7396c6300247efc090c53ffc11e0c85caeffdddf5"

RPROVIDES:${PN} += "perl(Image::Sane) perl(Image::Sane::Device) perl-Image-Sane perl-Image-Sane(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsane.so.1()(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Exception::Class) perl(Readonly)"

inherit rpm
