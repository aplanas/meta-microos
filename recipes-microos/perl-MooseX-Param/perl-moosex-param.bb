SUMMARY = "Simple role to provide a standard param method"
DESCRIPTION = "This is a very simple Moose role which provides a the CGI manpage like \
'param' method. \
 \
I found that I had written this code over and over and over and over again, \
and each time it was the same. So I thought, why not put it in a role?"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-Param-0.02-9.24.noarch.rpm"
RPM_HASH = "86a3a395f58b3b8e32c0d2a0381e77188e7c8e088b945f0d83cae51d715133062e7e6dd49bc2d3dbb2cbe697407ba387af4e3b9ebcd6bee0e168d4e89a74acf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Param) perl-MooseX-Param"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moose)"

inherit rpm
