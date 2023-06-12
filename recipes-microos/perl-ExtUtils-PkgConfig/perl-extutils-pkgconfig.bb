SUMMARY = "Simplistic Interface to Pkg-Config"
DESCRIPTION = "The pkg-config program retrieves information about installed libraries, \
usually for the purposes of compiling against and linking to them. \
 \
ExtUtils::PkgConfig is a very simplistic interface to this utility, \
intended for use in the Makefile.PL of perl extensions which bind libraries \
that pkg-config knows. It is really just boilerplate code that you would've \
written yourself."
LICENSE = "LGPL-2.1+"

PV = "1.160000"

RPM_NAME = "perl-ExtUtils-PkgConfig-1.160000-1.23.noarch.rpm"
RPM_HASH = "f6b4eca66b618ca809fbe156960e16afe2c9586ea332f07943365e95a2c002fc7e7e20d3cf6a277990d4d4c7fce0e16eacaeff0f00c128a1e3bddc1cfe9c580f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(ExtUtils::PkgConfig) \
perl-ExtUtils-PkgConfig"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
pkgconfig"

inherit rpm
