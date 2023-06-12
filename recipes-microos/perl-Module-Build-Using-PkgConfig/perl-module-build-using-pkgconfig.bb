SUMMARY = "Extend Module::Build to more easily use platform libraries provided by pkg-config"
DESCRIPTION = "This subclass of Module::Build provides some handy methods to assist the \
_Build.PL_ script of XS-based module distributions that make use of \
platform libraries managed by _pkg-config_. \
 \
As well as supporting libraries installed on a platform-wide basis and thus \
visible to _pkg-config_ itself, this subclass also assists with \
'Alien::'-based wrappers of these system libraries, allowing them to be \
dynamically installed at build time if the platform does not provide them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Module-Build-Using-PkgConfig-0.03-1.11.noarch.rpm"
RPM_HASH = "a1a6df6c28e9af60a5d4b39fbb31e59cfa729df1b8373985bebe03933794e1325dca4ed5988d00f7a9adc027acfd89f09a3b10525e93505c6c64a6b622c595f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Build::Using::PkgConfig) \
perl-Module-Build-Using-PkgConfig"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(ExtUtils::PkgConfig) \
perl(Module::Build)"

inherit rpm
