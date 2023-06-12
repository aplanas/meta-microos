SUMMARY = "Create and manipulate PAR distributions"
DESCRIPTION = "This module creates and manipulates _PAR distributions_. They are \
architecture-specific *PAR* files, containing everything under _blib/_ of \
CPAN distributions after their 'make' or 'Build' stage, a _META.yml_ \
describing metadata of the original CPAN distribution, and a _MANIFEST_ \
detailing all files within it. Digitally signed PAR distributions will also \
contain a _SIGNATURE_ file. \
 \
The naming convention for such distributions is: \
 \
    $NAME-$VERSION-$ARCH-$PERL_VERSION.par \
 \
For example, 'PAR-Dist-0.01-i386-freebsd-5.8.0.par' corresponds to the 0.01 \
release of 'PAR-Dist' on CPAN, built for perl 5.8.0 running on \
'i386-freebsd'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-PAR-Dist-0.52-1.1.noarch.rpm"
RPM_HASH = "d89ae33ba4b79e4efdb41b76a2375339739380d9f6472018213955a8f2202edbb4f9a3ced075d5e436d9760b40bc467d522abd492bb87abb9ea5d371fd48d2ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PAR::Dist) \
perl-PAR-Dist"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
